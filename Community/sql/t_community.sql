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

 Date: 04/08/2023 14:12:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_community
-- ----------------------------
DROP TABLE IF EXISTS `t_community`;
CREATE TABLE `t_community`  (
  `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `com_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `com_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `safe_person` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `createTime` datetime(0) NULL DEFAULT NULL,
  `updateTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_community
-- ----------------------------
INSERT INTO `t_community` VALUES (1, '小区A', '住宅', '张三,李四,刘,123', '2000-01-01 00:48:32', '2000-01-01 00:48:32');
INSERT INTO `t_community` VALUES (2, '小区B', '住宅', '刘', '2000-01-01 00:53:00', '2000-01-01 00:53:00');
INSERT INTO `t_community` VALUES (3, '小区C', '住宅', '刘', '2000-01-01 00:53:00', '2000-01-01 00:53:00');
INSERT INTO `t_community` VALUES (4, '小区D', '住宅', '刘', '2000-01-01 00:54:02', '2000-01-01 00:54:02');
INSERT INTO `t_community` VALUES (5, '小区E', '住宅', '刘', '2000-01-01 00:54:11', '2000-01-01 00:00:01');
INSERT INTO `t_community` VALUES (6, '一号院', '商铺', '刘', '2000-01-01 00:00:50', '2000-01-01 00:00:50');
INSERT INTO `t_community` VALUES (7, '一号院', '别墅', '刘', '2000-01-01 00:00:00', '2000-01-01 00:00:00');
INSERT INTO `t_community` VALUES (8, '华润', '住宅', '张三', '2000-01-01 00:13:29', '2000-01-01 00:13:29');
INSERT INTO `t_community` VALUES (9, '天河', '商铺', '李四,刘', '2000-01-01 00:05:00', '2000-01-01 00:05:00');
INSERT INTO `t_community` VALUES (10, '天威', '别墅', '123', '2000-01-01 00:06:08', '2000-01-01 00:06:08');
INSERT INTO `t_community` VALUES (11, '小区A', '商铺', '123', '2000-01-01 00:19:56', '2000-01-01 00:19:56');
INSERT INTO `t_community` VALUES (28, 'cs', '住宅', '小郭', '2023-08-04 13:25:30', '2023-08-04 13:25:30');

SET FOREIGN_KEY_CHECKS = 1;
