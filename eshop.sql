/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : eshop

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-07-08 20:33:30
*/
CREATE database eshop ;

USE eshop;

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT 'z',
  `balance` double(10,2) DEFAULT NULL COMMENT '账户余额',
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `update_dt` datetime DEFAULT NULL COMMENT '最后操作时间',
  PRIMARY KEY (`acc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL,
  `or_id` varchar(255) DEFAULT NULL COMMENT '订单编号',
  `prod_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `create_dt` datetime DEFAULT NULL COMMENT '创建时间',
  `or_state` int(2) DEFAULT '0' COMMENT '订单状态 0有效 1无效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `prod_id` int(11) NOT NULL AUTO_INCREMENT,
  `prod_name` varchar(255) DEFAULT NULL COMMENT '产品名称',
  `prod_stock` int(10) DEFAULT '0' COMMENT '库存',
  `prod_state` int(2) DEFAULT '0' COMMENT '产品状态 0有效 1无效',
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) DEFAULT NULL,
  `user_role` int(2) DEFAULT NULL,
  `phone_num` varchar(11) DEFAULT NULL,
  `user_rela_name` varchar(20) DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `create_dt` datetime DEFAULT NULL,
  `user_state` int(2) DEFAULT '0' COMMENT '0有效 1作废',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=100002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('100001', 'admin', '1', '1560000000', 'admin', '100001', '2018-07-07 21:01:02', '0');
