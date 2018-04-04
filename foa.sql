/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : foa

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-04-04 12:27:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for fishery
-- ----------------------------
DROP TABLE IF EXISTS `fishery`;
CREATE TABLE `fishery` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `owner` varchar(255) DEFAULT NULL,
  `bind_status` varchar(255) DEFAULT NULL,
  `bind_address` varchar(255) DEFAULT NULL,
  `sell_status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fishery
-- ----------------------------

-- ----------------------------
-- Table structure for market
-- ----------------------------
DROP TABLE IF EXISTS `market`;
CREATE TABLE `market` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fishery_id` int(11) DEFAULT NULL,
  `sell_status` int(11) DEFAULT NULL,
  `start_price` decimal(10,2) DEFAULT NULL,
  `stop_price` decimal(10,2) DEFAULT NULL,
  `sell_duration` int(11) DEFAULT NULL,
  `sell_start_time` varchar(255) DEFAULT NULL,
  `static_price` decimal(10,2) DEFAULT NULL,
  `favor_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of market
-- ----------------------------

-- ----------------------------
-- Table structure for opslog
-- ----------------------------
DROP TABLE IF EXISTS `opslog`;
CREATE TABLE `opslog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `action` varchar(255) DEFAULT NULL,
  `txhash` varchar(255) DEFAULT NULL,
  `memo` varchar(255) DEFAULT NULL,
  `action_time` varchar(0) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of opslog
-- ----------------------------

-- ----------------------------
-- Table structure for refer
-- ----------------------------
DROP TABLE IF EXISTS `refer`;
CREATE TABLE `refer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `txhash` varchar(255) DEFAULT NULL,
  `refer_code` varchar(255) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `create_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of refer
-- ----------------------------

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
