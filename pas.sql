/*
 Navicat Premium Data Transfer

 Source Server         : win7
 Source Server Type    : MySQL
 Source Server Version : 50639
 Source Host           : 192.168.123.241:3306
 Source Schema         : pas

 Target Server Type    : MySQL
 Target Server Version : 50639
 File Encoding         : 65001

 Date: 16/03/2020 19:20:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gysname
-- ----------------------------
DROP TABLE IF EXISTS `gysname`;
CREATE TABLE `gysname` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of gysname
-- ----------------------------
BEGIN;
INSERT INTO `gysname` VALUES (1, '加拿大麦格纳');
INSERT INTO `gysname` VALUES (3, '德国罗伯特·博世');
INSERT INTO `gysname` VALUES (4, '日本电装');
INSERT INTO `gysname` VALUES (5, '法国佛吉亚');
INSERT INTO `gysname` VALUES (6, '德国采埃孚');
INSERT INTO `gysname` VALUES (7, '韩国现代摩比斯');
INSERT INTO `gysname` VALUES (10, '马勒');
INSERT INTO `gysname` VALUES (13, '嘉实多');
COMMIT;

-- ----------------------------
-- Table structure for tb_spinfo
-- ----------------------------
DROP TABLE IF EXISTS `tb_spinfo`;
CREATE TABLE `tb_spinfo` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '零件编号',
  `spname` varchar(50) DEFAULT NULL COMMENT '零件名',
  `cd` varchar(50) DEFAULT NULL COMMENT '产地',
  `gg` varchar(20) DEFAULT NULL COMMENT '零件规格',
  `ph` varchar(32) DEFAULT NULL COMMENT '编码',
  `gysname` varchar(50) DEFAULT NULL COMMENT '供应商名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_spinfo
-- ----------------------------
BEGIN;
INSERT INTO `tb_spinfo` VALUES (1, '曲轴', '成都', '300x30', '2671230', '加拿大麦格纳');
INSERT INTO `tb_spinfo` VALUES (2, '宝马电池', '成都', '30000mAh', '2671232', '加拿大麦格纳');
INSERT INTO `tb_spinfo` VALUES (3, '轮胎', '眉山', '140/60R18 64H', '2671232', '德国罗伯特·博世');
INSERT INTO `tb_spinfo` VALUES (4, '前门翼子板', '日本', '200x220', '2671233', '日本电装');
INSERT INTO `tb_spinfo` VALUES (5, '奔驰电池', '十堰', '35000mAh', '4654545', '法国佛吉亚');
INSERT INTO `tb_spinfo` VALUES (6, '奥迪电池', '南充', '34000mAh', '6546745', '德国采埃孚');
INSERT INTO `tb_spinfo` VALUES (7, '现代汽车电池', '重庆', '260000mAh', '64564', '韩国现代摩比斯');
INSERT INTO `tb_spinfo` VALUES (8, '行车记录仪', '成都', '无', '564646', '法国佛吉亚');
INSERT INTO `tb_spinfo` VALUES (9, '火花塞总成', '成都', 'ZRSSI332', '10521894278', '德国罗伯特·博世');
INSERT INTO `tb_spinfo` VALUES (10, '机油滤清器', '上海', '单品', '414256', '马勒');
INSERT INTO `tb_spinfo` VALUES (11, '刹车片后片', '中国大陆', '一对', '624490', '德国罗伯特·博世');
INSERT INTO `tb_spinfo` VALUES (12, '刹车片前片', '中国大陆', '一对', '729170', '德国罗伯特·博世');
INSERT INTO `tb_spinfo` VALUES (13, '钛流体全合成机油润滑油5W-40', '中国', '4L', '782924', '嘉实多');
INSERT INTO `tb_spinfo` VALUES (14, '钛流体全合成机油润滑油5W-30', '中国', '4L', '782909', '嘉实多');
INSERT INTO `tb_spinfo` VALUES (15, '钛流体全合成机油润滑油0W-40', '中国', '4L', '731320', '嘉实多');
COMMIT;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `status` int(2) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
BEGIN;
INSERT INTO `userinfo` VALUES (2, '管理员', 'admin', '$2a$10$NI8AVUAhMXK5LCDr8LSzh.o6/qYHBL.2GLtY6e882uL5CgOtziy/S', 1, '15892767672');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
