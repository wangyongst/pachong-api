/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : foa

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-15 15:50:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for fishery
-- ----------------------------
DROP TABLE IF EXISTS `fishery`;
CREATE TABLE `fishery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `bind_status` varchar(255) DEFAULT NULL,
  `bind_address` varchar(255) DEFAULT NULL,
  `sell_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fishery
-- ----------------------------
INSERT INTO `fishery` VALUES ('1', 'dfdfdf', '1', 'unbinding', 'comesdf', 'selling');

-- ----------------------------
-- Table structure for market
-- ----------------------------
DROP TABLE IF EXISTS `market`;
CREATE TABLE `market` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fishery_id` int(11) DEFAULT NULL,
  `sell_status` varchar(255) DEFAULT NULL,
  `start_price` decimal(10,2) DEFAULT NULL,
  `stop_price` decimal(10,2) DEFAULT NULL,
  `sell_duration` int(11) DEFAULT NULL,
  `sell_start_time` varchar(255) DEFAULT NULL,
  `static_price` decimal(10,2) DEFAULT NULL,
  `favor_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market
-- ----------------------------
INSERT INTO `market` VALUES ('3', '1', 'selling', '10.01', '11.55', '8000', '2018-04-15 15:26:11', null, '0');

-- ----------------------------
-- Table structure for opslog
-- ----------------------------
DROP TABLE IF EXISTS `opslog`;
CREATE TABLE `opslog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `txhash` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `action_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opslog
-- ----------------------------
INSERT INTO `opslog` VALUES ('1', '1', '设置渔场名称', null, null, '2018-04-06 14:35:39');
INSERT INTO `opslog` VALUES ('2', '1', '设置渔场名称', null, null, '2018-04-06 14:37:29');
INSERT INTO `opslog` VALUES ('3', '1', '设置渔场名称', null, null, '2018-04-06 14:38:05');
INSERT INTO `opslog` VALUES ('4', '1', '设置渔场名称', null, null, '2018-04-06 14:39:22');
INSERT INTO `opslog` VALUES ('5', '1', '设置渔场名称', null, null, '2018-04-06 14:40:08');
INSERT INTO `opslog` VALUES ('6', '1', '设置渔场名称', null, null, '2018-04-06 14:40:37');
INSERT INTO `opslog` VALUES ('7', '1', '设置渔场名称', null, null, '2018-04-06 14:40:50');
INSERT INTO `opslog` VALUES ('8', '1', '设置渔场名称', null, null, '2018-04-06 14:42:56');
INSERT INTO `opslog` VALUES ('9', '1', '设置渔场名称', null, null, '2018-04-06 14:43:31');
INSERT INTO `opslog` VALUES ('10', '1', '设置渔场名称', null, 'good', '2018-04-06 14:44:38');
INSERT INTO `opslog` VALUES ('11', '1', '设置渔场名称', 'ok', 'good', '2018-04-06 14:44:57');
INSERT INTO `opslog` VALUES ('12', '1', '设置渔场名称', 'ok', 'good', '2018-04-06 14:45:17');
INSERT INTO `opslog` VALUES ('13', '1', '绑定游戏地址', 'ok', 'good', '2018-04-06 14:53:03');
INSERT INTO `opslog` VALUES ('14', '1', '绑定游戏地址', 'ok', 'good', '2018-04-06 14:54:30');
INSERT INTO `opslog` VALUES ('15', '1', '取消绑定', 'ok', 'good', '2018-04-06 14:55:59');
INSERT INTO `opslog` VALUES ('16', '1', '出售', 'ok', 'good', '2018-04-06 14:58:20');
INSERT INTO `opslog` VALUES ('17', '1', '出售', 'ok', 'good', '2018-04-06 14:58:43');
INSERT INTO `opslog` VALUES ('18', '1', '出售', 'ok', 'good', '2018-04-06 14:59:50');
INSERT INTO `opslog` VALUES ('19', '1', '出售', 'ok', 'good', '2018-04-06 15:04:20');
INSERT INTO `opslog` VALUES ('20', '1', '出售', 'ok', 'good', '2018-04-06 15:04:58');
INSERT INTO `opslog` VALUES ('21', '1', '出售', 'ok', 'good', '2018-04-06 15:05:23');
INSERT INTO `opslog` VALUES ('22', '1', '出售', 'ok', 'good', '2018-04-06 15:07:38');
INSERT INTO `opslog` VALUES ('23', '1', '取消绑定', 'ok', 'good', '2018-04-06 15:09:13');
INSERT INTO `opslog` VALUES ('24', '1', '取消出售', 'ok', 'good', '2018-04-06 15:10:21');
INSERT INTO `opslog` VALUES ('25', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:12:16');
INSERT INTO `opslog` VALUES ('26', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:12:52');
INSERT INTO `opslog` VALUES ('27', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:12:55');
INSERT INTO `opslog` VALUES ('28', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:12:56');
INSERT INTO `opslog` VALUES ('29', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:12:56');
INSERT INTO `opslog` VALUES ('30', '1', '购买渔场', 'ok', 'good', '2018-04-06 15:17:51');
INSERT INTO `opslog` VALUES ('31', '1', '赞', null, null, '2018-04-06 15:20:14');
INSERT INTO `opslog` VALUES ('32', '1', '出售', 'ok', 'good', '2018-04-06 15:20:49');
INSERT INTO `opslog` VALUES ('33', '1', '赞', null, null, '2018-04-06 15:21:04');
INSERT INTO `opslog` VALUES ('34', '1', '赞', null, null, '2018-04-06 15:21:08');
INSERT INTO `opslog` VALUES ('35', '1', '赞', null, null, '2018-04-06 15:21:09');
INSERT INTO `opslog` VALUES ('36', '1', '赞', null, null, '2018-04-06 15:21:09');
INSERT INTO `opslog` VALUES ('37', '1', '赞', null, null, '2018-04-06 15:21:09');
INSERT INTO `opslog` VALUES ('38', '1', '赞', null, null, '2018-04-06 15:21:10');
INSERT INTO `opslog` VALUES ('39', '1', '赞', null, null, '2018-04-06 15:21:10');
INSERT INTO `opslog` VALUES ('40', '1', '赞', null, null, '2018-04-06 15:21:10');
INSERT INTO `opslog` VALUES ('41', '1', '赞', null, null, '2018-04-06 15:21:11');
INSERT INTO `opslog` VALUES ('42', '1', '赞', null, null, '2018-04-06 15:21:11');
INSERT INTO `opslog` VALUES ('43', '1', '赞', null, null, '2018-04-06 15:21:11');
INSERT INTO `opslog` VALUES ('44', '1', '设置渔场名称', 'ok', 'good', '2018-04-15 14:51:16');
INSERT INTO `opslog` VALUES ('45', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 14:51:30');
INSERT INTO `opslog` VALUES ('46', '1', '设置渔场名称', 'ok', 'good', '2018-04-15 14:52:04');
INSERT INTO `opslog` VALUES ('47', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:10:56');
INSERT INTO `opslog` VALUES ('48', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:11:21');
INSERT INTO `opslog` VALUES ('49', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:11:22');
INSERT INTO `opslog` VALUES ('50', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:11:22');
INSERT INTO `opslog` VALUES ('51', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:11:23');
INSERT INTO `opslog` VALUES ('52', '221112', '设置渔场名称', 'ok', 'good', '2018-04-15 15:11:33');
INSERT INTO `opslog` VALUES ('53', '221112', '绑定游戏地址', 'ok', 'good', '2018-04-15 15:12:16');
INSERT INTO `opslog` VALUES ('54', '221112', '取消绑定', 'ok', 'good', '2018-04-15 15:12:36');
INSERT INTO `opslog` VALUES ('55', '221112', '出售', 'ok', 'good', '2018-04-15 15:12:50');
INSERT INTO `opslog` VALUES ('56', '221112', '取消出售', 'ok', 'good', '2018-04-15 15:13:05');
INSERT INTO `opslog` VALUES ('57', '221112', '购买渔场', 'ok', 'good', '2018-04-15 15:13:18');
INSERT INTO `opslog` VALUES ('58', '221112', '赞', null, null, '2018-04-15 15:13:32');
INSERT INTO `opslog` VALUES ('59', '221112', '取消绑定', 'ok', 'good', '2018-04-15 15:25:53');
INSERT INTO `opslog` VALUES ('60', '221112', '出售', 'ok', 'good', '2018-04-15 15:26:11');

-- ----------------------------
-- Table structure for refer
-- ----------------------------
DROP TABLE IF EXISTS `refer`;
CREATE TABLE `refer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `txhash` varchar(255) DEFAULT NULL,
  `refer_code` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  `refer_fee` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refer
-- ----------------------------
INSERT INTO `refer` VALUES ('1', null, 'NNoxWNqV', null, null, '1.85');
INSERT INTO `refer` VALUES ('2', null, 'NNoxWNqV', null, null, '3.53');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `sign_message` varchar(255) DEFAULT NULL,
  `signed_message` varchar(255) DEFAULT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `avatar` varchar(255) DEFAULT NULL,
  `refer_code` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '11111:', '11111:', '11111', 'come', 'F:\\img\\oZxpZO7q.jpg', 'NNoxWNqV');
INSERT INTO `user` VALUES ('2', '11111', '11111', '11111', null, 'F:\\img\\hfwmp2rL.jpg', 'SUfKRom0');
INSERT INTO `user` VALUES ('3', '11111', '11111', '11111', null, null, 'bJDf4xq3');
INSERT INTO `user` VALUES ('5', '11111', '11111', '11111', null, null, 'hr1agJag');
INSERT INTO `user` VALUES ('6', '11111', '11111', '11111', null, null, 'BNKsYEMC');
INSERT INTO `user` VALUES ('7', '11111', '11111', '11111', null, null, 'XUVnq12k');
INSERT INTO `user` VALUES ('8', '11111', '11111', '11111', null, null, 'zr9DGjBO');
INSERT INTO `user` VALUES ('9', '11111', '11111', '11111', null, null, 'VAMyknYJ');
INSERT INTO `user` VALUES ('10', '11111', '11111', '11111', null, null, 'NlfnHyqY');
INSERT INTO `user` VALUES ('11', '111112', '11111', '11111', null, null, 'zliHOBBv');
INSERT INTO `user` VALUES ('12', '222', '11111', '11111', 'come', null, 'kLTMoRMC');
INSERT INTO `user` VALUES ('13', '221112', '11111', '11111', 'sscomse', 'HeAjJa6k.jpg', 'DgTWNrpq');
