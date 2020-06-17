/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2020-06-16 09:48:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for abnormal_message
-- ----------------------------
DROP TABLE IF EXISTS `abnormal_message`;
CREATE TABLE `abnormal_message` (
  `tid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `message_id` varchar(100) NOT NULL COMMENT '消息id',
  `queue_name` varchar(100) NOT NULL COMMENT '队列名称',
  `message_status` varchar(10) NOT NULL COMMENT '消息状态（1：从队列中删除，2：重入队列）',
  `content` mediumtext NOT NULL COMMENT '消息内容',
  `requeue_count` int(10) NOT NULL DEFAULT '0' COMMENT '重推次数',
  `last_requeue_time` timestamp NULL DEFAULT NULL COMMENT '最后一次推送时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`tid`),
  UNIQUE KEY `uk_message_id` (`message_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='异常队列消息';

-- ----------------------------
-- Records of abnormal_message
-- ----------------------------
INSERT INTO `abnormal_message` VALUES ('1', '2570580843791687687777', 'akane_rabbitmqrabbit-q-test_update', '1', 'hihihi', '0', null, '2020-06-03 18:17:01', '2020-06-03 18:17:01');
INSERT INTO `abnormal_message` VALUES ('2', '2570580418489262087777', 'akane_rabbitmqrabbit-q-test_update', '1', 'hihihi', '0', null, '2020-06-03 18:17:01', '2020-06-03 18:17:01');
INSERT INTO `abnormal_message` VALUES ('3', '2570589543449272327777', 'akane_rabbitmqrabbit-q-test_update', '1', 'hihihi23', '0', null, '2020-06-03 18:17:57', '2020-06-03 18:17:57');
INSERT INTO `abnormal_message` VALUES ('4', '2570614140357877767777', 'akane_rabbitmqrabbit-q-test_update', '1', 'hihihi23', '0', null, '2020-06-03 18:20:13', '2020-06-03 18:20:13');
INSERT INTO `abnormal_message` VALUES ('5', '2570617602839715847777', 'akane_rabbitmqrabbit-q-test_update', '1', '123456', '0', null, '2020-06-03 18:20:34', '2020-06-03 18:20:34');
INSERT INTO `abnormal_message` VALUES ('6', '2570652650947256327777', 'akane_rabbitmqrabbit-q-test_update', '1', '456456153', '0', null, '2020-06-03 18:24:02', '2020-06-03 18:24:02');
INSERT INTO `abnormal_message` VALUES ('7', '2570684353677926407777', 'akane_rabbitmqrabbit-q-test_update', '1', '45645615311', '0', null, '2020-06-03 18:27:11', '2020-06-03 18:27:11');
INSERT INTO `abnormal_message` VALUES ('8', '2570699000019722247777', 'akane_rabbitmqrabbit-q-test_update', '1', '45645615311', '0', null, '2020-06-03 18:28:39', '2020-06-03 18:28:39');
INSERT INTO `abnormal_message` VALUES ('9', '2570703013465333767777', 'akane_rabbitmqrabbit-q-test_update', '1', 'ces', '0', null, '2020-06-03 18:29:03', '2020-06-03 18:29:03');

-- ----------------------------
-- Table structure for message_info
-- ----------------------------
DROP TABLE IF EXISTS `message_info`;
CREATE TABLE `message_info` (
  `tid` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标识',
  `msg_id` varchar(100) NOT NULL DEFAULT '' COMMENT '业务ID',
  `msg_status` varchar(1) NOT NULL DEFAULT '' COMMENT '状态',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`tid`),
  UNIQUE KEY `msg_id` (`msg_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='本地消息排重表';

-- ----------------------------
-- Records of message_info
-- ----------------------------
INSERT INTO `message_info` VALUES ('1', '2570567212303687687777', '', '2020-06-03 17:55:34');
INSERT INTO `message_info` VALUES ('2', '2570705234600960007777', '', '2020-06-03 18:09:16');
INSERT INTO `message_info` VALUES ('3', '2570721633658511367777', '', '2020-06-03 18:13:48');
INSERT INTO `message_info` VALUES ('4', '2570756749546004487777', '', '2020-06-03 18:15:01');
INSERT INTO `message_info` VALUES ('5', '2570767543335690247777', '', '2020-06-03 18:16:09');

-- ----------------------------
-- Table structure for note
-- ----------------------------
DROP TABLE IF EXISTS `note`;
CREATE TABLE `note` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `idx_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of note
-- ----------------------------
INSERT INTO `note` VALUES ('1', '6001', 'Flask', 'what is the flask', '2020-04-30 13:56:24');
INSERT INTO `note` VALUES ('2', '6001', 'Java', 'HelloWorld', '2020-05-06 17:13:37');

-- ----------------------------
-- Table structure for test_index
-- ----------------------------
DROP TABLE IF EXISTS `test_index`;
CREATE TABLE `test_index` (
  `id` int(11) NOT NULL,
  `a` int(32) DEFAULT NULL,
  `b` int(32) DEFAULT NULL,
  `c` int(32) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idx_a_b_c` (`a`,`b`,`c`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of test_index
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `username` varchar(64) DEFAULT NULL,
  `desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_user_id` (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '6001', 'Yui', '轻音少女- K-ON!');
