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

 Date: 04/08/2023 14:32:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `mobile` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `self_introduce` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_admin
-- ----------------------------
INSERT INTO `t_admin` VALUES (1, '张三', '123456', '13812345678', '我是张三,负责管理系统的安全和用户权限.');
INSERT INTO `t_admin` VALUES (2, '李四', '654321', '13987654321', '我是李四,负责系统的运维和性能优化.');
INSERT INTO `t_admin` VALUES (3, '王五', 'abcdef', '13698765432', '我是王五,负责系统的数据库管理和备份.');
INSERT INTO `t_admin` VALUES (4, '赵六', '123abc', '13787654321', '我是赵六,负责系统的日志记录和异常处理.');
INSERT INTO `t_admin` VALUES (6, '小赵', '1006', '521521', '小护士呀小护士');
INSERT INTO `t_admin` VALUES (10, '小郭', '0813', '17550228932', '嘿嘿嘿');

SET FOREIGN_KEY_CHECKS = 1;
