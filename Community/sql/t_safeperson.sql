/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : bz

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 04/08/2023 14:13:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_safeperson
-- ----------------------------
DROP TABLE IF EXISTS `t_safeperson`;
CREATE TABLE `t_safeperson`  (
  `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `safe_nick` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `safe_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `safe_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  `updateTime` datetime(0) NULL DEFAULT NULL,
  `status` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 18 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_safeperson
-- ----------------------------
INSERT INTO `t_safeperson` VALUES (1, 'zhangsan', '张三', '15666666666', '2000-01-01 00:00:20', '2000-01-01 00:01:50', 1);
INSERT INTO `t_safeperson` VALUES (2, 'lisi', '李四', '18955555555', '2000-01-01 00:00:39', '2000-01-01 00:00:00', 1);
INSERT INTO `t_safeperson` VALUES (3, 'wangwu', '王五', '17633333333', '2000-01-01 00:00:14', '2000-01-01 00:13:00', 1);
INSERT INTO `t_safeperson` VALUES (4, 'wang', '刘', '13864509861', '2000-01-01 00:00:17', '2000-01-01 00:50:00', 0);
INSERT INTO `t_safeperson` VALUES (5, 'admin', '123', '13021350356', '2000-01-01 00:00:00', '2000-01-01 00:50:58', 0);

SET FOREIGN_KEY_CHECKS = 1;
