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

 Date: 04/08/2023 14:12:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_owner
-- ----------------------------
DROP TABLE IF EXISTS `t_owner`;
CREATE TABLE `t_owner`  (
  `id` int(5) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `own_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '业主姓名',
  `own_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '业主电话',
  `com_address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '所属小区/商铺/别墅',
  `house_number` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '房间号/地址',
  `people_count` int(3) NULL DEFAULT NULL COMMENT '家庭成员数',
  `is_safe` int(1) NULL DEFAULT NULL COMMENT '设备是否安全',
  `is_check` int(1) NULL DEFAULT NULL COMMENT '是否入户安检',
  `house_count` int(3) NULL DEFAULT NULL COMMENT '入户次数',
  `sort` int(3) NULL DEFAULT NULL COMMENT '排序',
  `notes` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `updateTime` datetime(0) NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 50 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_owner
-- ----------------------------
INSERT INTO `t_owner` VALUES (1, '张三1', '13733333333', '小区A', '1-1-101', 3, 1, 1, 3, 0, '', '2022-04-13 10:41:00', '2023-08-02 15:31:51');
INSERT INTO `t_owner` VALUES (2, '李四', '18344444444', '小区A', '1-1-102', 3, 0, 1, 3, 0, NULL, '2022-04-13 10:41:00', '2023-06-16 15:00:00');
INSERT INTO `t_owner` VALUES (3, '王五', '15355555555', '小区A', '1-1-201', 3, 1, 1, 4, 0, NULL, '2022-04-13 10:41:00', '2023-06-16 15:00:00');
INSERT INTO `t_owner` VALUES (4, '贾六', '13566666666', '小区A', '1-1-202', 3, 1, 0, 4, 0, NULL, '2022-04-13 10:41:00', '2023-07-03 17:55:00');
INSERT INTO `t_owner` VALUES (5, '毛七', '13077777777', '小区A', '1-1-301', 3, 1, 1, 6, 0, NULL, '2022-04-13 10:41:00', '2023-07-20 15:53:00');
INSERT INTO `t_owner` VALUES (6, '1', '16734562376', '小区A', 'I1-1-1', 1, 1, 0, 0, 0, '-', '2023-03-07 21:49:00', '2023-03-07 21:49:00');
INSERT INTO `t_owner` VALUES (7, '美好家园', '13716689119', '小区E', '一号楼-2单-102', 0, 0, 1, 0, 0, '-', '2023-03-11 10:19:00', '2023-03-11 10:19:00');
INSERT INTO `t_owner` VALUES (8, '潘先生', '13977212345', '一号院', '一号楼裙楼128号', 3, 1, 1, 0, 0, '-', '2023-03-11 20:11:00', '2023-03-11 20:11:00');
INSERT INTO `t_owner` VALUES (9, '王胖子', '15288888888', '华润', '3-2-502', 3, 1, 1, 1, 0, NULL, '2023-03-13 15:21:00', '2023-03-13 15:22:00');
INSERT INTO `t_owner` VALUES (10, '丽丽', '13633333355', '华润', '6-3-301', 5, 1, 1, 0, 0, '-', '2023-03-13 15:23:00', '2023-03-13 15:23:00');
INSERT INTO `t_owner` VALUES (11, '锦瑟', '13825469785', '华润', '6-2-102', 3, 1, 0, 0, 0, '-', '2023-03-13 15:49:00', '2023-03-13 15:49:00');
INSERT INTO `t_owner` VALUES (12, '二妮', '17854633696', '华润', '6-1-506', 4, 0, 1, 1, 0, '-', '2023-03-13 15:50:00', '2023-03-13 15:53:00');
INSERT INTO `t_owner` VALUES (13, '哈哈', '13312344321', '华润', '2004/4/4', 4, 1, 1, 0, 0, '-', '2023-03-14 23:17:00', '2023-03-14 23:17:00');
INSERT INTO `t_owner` VALUES (14, '罢了', '13800138000', '小区A', '101-100-100', 5, 1, 0, 1, 0, '-', '2023-03-15 16:46:00', '2023-04-25 10:32:00');
INSERT INTO `t_owner` VALUES (15, '父子兵', '15266666666', '小区A', '7-2-101', 0, 1, 1, 1, 0, '-', '2023-03-24 14:10:00', '2023-03-24 14:11:00');
INSERT INTO `t_owner` VALUES (16, '王麻子', '19923600066', '华润', '2014/1/16', 4, 1, 1, 0, 0, '-', '2023-03-27 12:35:00', '2023-03-27 12:35:00');
INSERT INTO `t_owner` VALUES (17, '李四光', '18605522356', '华润', '201-3-502', 5, 0, 1, 1, 0, '-', '2023-03-29 11:00:00', '2023-04-01 18:33:00');
INSERT INTO `t_owner` VALUES (18, '测试', '13800138000', '小区A', '2001/1/1', 23, 1, 1, 1, 0, '-', '2023-04-06 22:05:00', '2023-04-27 16:58:00');
INSERT INTO `t_owner` VALUES (19, '机器人', '15735156882', '小区A', '10-1-802', 2, 1, 0, 0, 0, '-', '2023-04-07 09:49:00', '2023-04-07 09:49:00');
INSERT INTO `t_owner` VALUES (20, '1', '15823003867', '小区A', '1-1-505', 0, 1, 1, 2, 0, '-', '2023-04-25 10:24:00', '2023-04-28 13:51:00');
INSERT INTO `t_owner` VALUES (21, '李四', '17366555642', '小区A', '1-2-301', 2, 1, 1, 1, 0, '-', '2023-05-15 05:31:00', '2023-05-15 05:33:00');
INSERT INTO `t_owner` VALUES (22, '付', '13661224547', '华润', '9-97-9561', 0, 0, 1, 1, 0, '-', '2023-05-31 10:31:00', '2023-05-31 10:33:00');
INSERT INTO `t_owner` VALUES (23, '付', '13661224547', '天威', '8-2-101', 2, 1, 1, 0, 0, NULL, '2023-05-31 10:37:00', '2023-05-31 10:37:00');
INSERT INTO `t_owner` VALUES (24, '付', '13661224547', '天河', '8-2-103', 5, 1, 0, 0, 0, NULL, '2023-05-31 10:39:00', '2023-05-31 10:39:00');
INSERT INTO `t_owner` VALUES (25, '李四', '13636948744', '小区A', '8-4-401', 5, 1, 1, 1, 0, '-', '2023-05-31 14:37:00', '2023-05-31 14:39:00');
INSERT INTO `t_owner` VALUES (26, '111', '17325808568', '小区A', '13-1-101', 0, 0, 1, 0, 0, '-', '2023-06-07 16:38:00', '2023-06-07 16:38:00');
INSERT INTO `t_owner` VALUES (27, '172', '15213147604', '小区A', 'uu-11-S', 0, 1, 1, 0, 0, '-', '2023-06-13 15:27:00', '2023-06-13 15:27:00');
INSERT INTO `t_owner` VALUES (28, 'test111', '18545854555', '华润', '1-1-101', 5, 1, 1, 2, 0, '-', '2023-06-16 17:32:00', '2023-07-05 23:15:00');
INSERT INTO `t_owner` VALUES (29, '测试', '13828825263', '小区A', '3-1-102', 0, 1, 1, 0, 0, '-', '2023-06-29 07:51:00', '2023-06-29 07:51:00');
INSERT INTO `t_owner` VALUES (30, 'xs', '13888888888', '小区A', '2001/2/3', 0, 1, 0, 0, 0, '-', '2023-06-30 05:41:00', '2023-06-30 05:41:00');
INSERT INTO `t_owner` VALUES (31, 'wenwiabg', '15216833199', '小区A', '1-2-2608', 3, 1, 1, 0, 0, '-', '2023-06-30 11:38:00', '2023-06-30 11:38:00');
INSERT INTO `t_owner` VALUES (32, '王大大', '13555555555', '小区A', '2008/8/8', 5, 1, 1, 1, 0, '-', '2023-07-14 15:25:00', '2023-07-14 15:26:00');
INSERT INTO `t_owner` VALUES (33, '123', '14565236521', '小区A', '2001/1/21', 2, 0, 1, 0, 0, '-', '2023-07-31 16:31:00', '2023-07-31 16:31:00');
INSERT INTO `t_owner` VALUES (34, '张三', '15388653209', '小区A', '3-10-111', 5, 1, 1, 1, 0, '-', '2023-07-31 16:56:00', '2023-07-31 17:03:00');
INSERT INTO `t_owner` VALUES (35, '李四', '13389275370', '小区A', '2002/2/2', 5, 1, 1, 0, 0, '-', '2023-07-31 17:10:00', '2023-07-31 17:10:00');
INSERT INTO `t_owner` VALUES (36, '马老师', '13389275370', '小区A', '2001/2/6', 0, 1, 1, 1, 0, '-', '2023-07-31 17:43:00', '2023-07-31 17:43:00');
INSERT INTO `t_owner` VALUES (37, 'billkin', '13888888888', '小区A', '12-1-123', 12, 1, 1, 1, 0, '-', '2023-07-31 17:50:00', '2023-07-31 17:51:00');
INSERT INTO `t_owner` VALUES (38, 'lsy', '15685692345', '小区A', '13-2-2006', 5, 1, 1, 0, 0, '-', '2023-08-01 10:18:00', '2023-08-01 10:18:00');

SET FOREIGN_KEY_CHECKS = 1;
