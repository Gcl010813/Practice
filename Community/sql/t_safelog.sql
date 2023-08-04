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

 Date: 04/08/2023 14:12:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_safelog
-- ----------------------------
DROP TABLE IF EXISTS `t_safelog`;
CREATE TABLE `t_safelog`  (
  `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT,
  `safe_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `own_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `own_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `com_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `house_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `notes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `own_signature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `is_pass` int(1) NULL DEFAULT NULL,
  `safeTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 78 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_safelog
-- ----------------------------
INSERT INTO `t_safelog` VALUES (1, '张三111111', '张三', '13733333333', '小区A', '1-1-101', '我是备注信息哦', '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-08-02 20:52:22');
INSERT INTO `t_safelog` VALUES (2, '张三', '李四', '18344444444', '小区A', '1-1-102', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-06 17:46:00');
INSERT INTO `t_safelog` VALUES (3, '张三', '王五', '15355555555', '小区A', '1-1-201', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-07 09:51:00');
INSERT INTO `t_safelog` VALUES (4, '张三', '毛七', '13077777777', '小区A', '1-1-301', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-08 11:41:00');
INSERT INTO `t_safelog` VALUES (5, '张三', '王五', '15355555555', '小区A', '1-1-201', '紧急', '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-08 12:00:00');
INSERT INTO `t_safelog` VALUES (6, '张三', '王五', '15355555555', '小区A', '1-1-201', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-03-08 14:38:00');
INSERT INTO `t_safelog` VALUES (7, '张三', '毛七', '13077777777', '小区A', '1-1-301', '紧急处理', '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-08 14:45:00');
INSERT INTO `t_safelog` VALUES (8, '张三', '贾六', '13566666666', '小区A', '1-1-202', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-08 20:01:00');
INSERT INTO `t_safelog` VALUES (9, '张三', '毛七', '13077777777', '小区A', '1-1-301', '牛逼', '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-11 10:24:00');
INSERT INTO `t_safelog` VALUES (10, '张三', '王胖子', '15288888888', '华润', '3-2-502', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-03-13 15:22:00');
INSERT INTO `t_safelog` VALUES (11, '张三', '二妮', '17854633696', '华润', '6-1-506', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-13 15:53:00');
INSERT INTO `t_safelog` VALUES (12, '张三', '父子兵', '15266666666', '小区A', '7-2-101', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-03-24 14:11:00');
INSERT INTO `t_safelog` VALUES (13, '张三', '张三', '13733333333', '小区A', '1-1-101', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-03-24 14:11:00');
INSERT INTO `t_safelog` VALUES (14, '张三', '李四光', '18605522356', '华润', '201-3-502', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-01 18:33:00');
INSERT INTO `t_safelog` VALUES (16, '张三', '李四', '18344444444', '小区A', '1-1-102', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-04 22:08:00');
INSERT INTO `t_safelog` VALUES (17, '张三', '贾六', '13566666666', '小区A', '1-1-202', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-12 06:40:00');
INSERT INTO `t_safelog` VALUES (18, '张三', '罢了', '13800138000', '小区A', '101-100-100', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-04-25 10:32:00');
INSERT INTO `t_safelog` VALUES (19, '张三', '测试', '13800138000', '小区A', '2001/1/1', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-27 16:58:00');
INSERT INTO `t_safelog` VALUES (20, '张三', '1', '15823003867', '小区A', '1-1-505', '不错', '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-28 13:44:00');
INSERT INTO `t_safelog` VALUES (21, '张三', '1', '15823003867', '小区A', '1-1-505', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-04-28 13:51:00');
INSERT INTO `t_safelog` VALUES (22, '张三', '李四', '17366555642', '小区A', '1-2-301', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-05-15 05:33:00');
INSERT INTO `t_safelog` VALUES (23, '张三', '付', '13661224547', '华润', '9-97-9561', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-05-31 10:33:00');
INSERT INTO `t_safelog` VALUES (26, '张三', '王五', '15355555555', '小区A', '1-1-201', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-06-16 15:00:00');
INSERT INTO `t_safelog` VALUES (27, '张三', '张三', '13733333333', '小区A', '1-1-101', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-06-29 23:56:00');
INSERT INTO `t_safelog` VALUES (28, '张三', '贾六', '13566666666', '小区A', '1-1-202', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 0, '2023-06-30 05:42:00');
INSERT INTO `t_safelog` VALUES (29, '张三', '贾六', '13566666666', '小区A', '1-1-202', NULL, '<img class=\"img-sm img-center\" src=\"../image/sign.png\".png\">', 1, '2023-07-03 17:55:00');

SET FOREIGN_KEY_CHECKS = 1;
