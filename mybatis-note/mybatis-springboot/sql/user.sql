/*
 Navicat Premium Data Transfer

 Source Server         : my-test
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 30/07/2019 18:24:08
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `usercode` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `username` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '昵称',
  `salt` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '盐值',
  `password` char(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码hash',
  `email` varchar(45) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '邮箱(登录账号)',
  `sex` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'M' COMMENT '用户性别',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '/FreeBlogs/img/comm/default-avatar.jpg' COMMENT '头像',
  `description` varchar(150) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '简单一句话，介绍你自己' COMMENT '简介',
  `github` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '${APP_PATH}/index.html' COMMENT 'github',
  `twitter` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '${APP_PATH}/index.html' COMMENT 'twitter',
  `weibo` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '${APP_PATH}/index.html' COMMENT 'weibo',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `uk_usercode`(`usercode`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 101 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
