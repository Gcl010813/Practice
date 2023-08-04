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

 Date: 04/08/2023 14:32:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nickName` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mobile` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `balance` double NULL DEFAULT NULL,
  `status` int(10) NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1024 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES (1001, '爱吃鱼的猫', '孙悟空', '159652354', '1', 5000, 1, '2023-07-26 15:25:18');
INSERT INTO `t_student` VALUES (1003, '如花', '马冬梅', '1568965265', '0', 4000, 1, '2023-07-26 15:27:09');
INSERT INTO `t_student` VALUES (1021, '小郭', '郭**', '17550228932', '1', 1314, 1, '2023-07-31 16:34:06');
INSERT INTO `t_student` VALUES (1023, '小赵', '赵**', '13193747396', '0', 1314, 1, '2023-07-31 16:56:19');

SET FOREIGN_KEY_CHECKS = 1;
