/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 60004
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 60004
File Encoding         : 65001

Date: 2016-07-21 17:25:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `attention`
-- ----------------------------
DROP TABLE IF EXISTS `attention`;
CREATE TABLE `attention` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_usermasterid` int(11) DEFAULT NULL,
  `a_userslavesid` int(11) DEFAULT NULL,
  `a_usermastername` varchar(50) DEFAULT NULL,
  `a_userslavesname` varchar(50) DEFAULT NULL,
  `a_time` datetime DEFAULT NULL,
  `a_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`a_id`),
  KEY `a_usermasterid` (`a_usermasterid`),
  KEY `a_userslavesid` (`a_userslavesid`),
  CONSTRAINT `attention_ibfk_1` FOREIGN KEY (`a_usermasterid`) REFERENCES `user_info` (`u_id`),
  CONSTRAINT `attention_ibfk_2` FOREIGN KEY (`a_userslavesid`) REFERENCES `user_info` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attention
-- ----------------------------

-- ----------------------------
-- Table structure for `board`
-- ----------------------------
DROP TABLE IF EXISTS `board`;
CREATE TABLE `board` (
  `b_id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(30) DEFAULT NULL,
  `c_id` int(11) DEFAULT NULL,
  `b_master_main` int(11) DEFAULT NULL,
  `b_master_slave1` int(11) DEFAULT NULL,
  `b_master_slave2` int(11) DEFAULT NULL,
  `b_image` varchar(50) DEFAULT NULL,
  `b_totalarticle` int(11) DEFAULT NULL,
  `b_totaluser` int(11) DEFAULT NULL,
  `b_lasttime` datetime DEFAULT NULL,
  `b_state` int(11) DEFAULT NULL,
  `b_forumnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`b_id`),
  KEY `c_id` (`c_id`),
  CONSTRAINT `board_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `classes` (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of board
-- ----------------------------

-- ----------------------------
-- Table structure for `classes`
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(20) DEFAULT NULL,
  `c_createtime` datetime DEFAULT NULL,
  `c_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------

-- ----------------------------
-- Table structure for `discuss`
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_did` int(11) DEFAULT NULL,
  `f_id` int(11) DEFAULT NULL,
  `d_mainuser_id` int(11) DEFAULT NULL,
  `d_mainuser_name` varchar(50) DEFAULT NULL,
  `d_slaveuser_id` int(11) DEFAULT NULL,
  `d_slaveuser_name` varchar(50) DEFAULT NULL,
  `d_content` text,
  `d_time` datetime DEFAULT NULL,
  `d_words` int(11) DEFAULT NULL,
  `d_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`d_id`),
  KEY `d_did` (`d_did`),
  KEY `f_id` (`f_id`),
  CONSTRAINT `discuss_ibfk_1` FOREIGN KEY (`d_did`) REFERENCES `discuss` (`d_id`),
  CONSTRAINT `discuss_ibfk_2` FOREIGN KEY (`f_id`) REFERENCES `forum` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------

-- ----------------------------
-- Table structure for `favorite`
-- ----------------------------
DROP TABLE IF EXISTS `favorite`;
CREATE TABLE `favorite` (
  `fa_id` int(11) NOT NULL AUTO_INCREMENT,
  `f_id` int(11) DEFAULT NULL,
  `u_id` int(11) DEFAULT NULL,
  `fa_time` datetime DEFAULT NULL,
  `fa_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`fa_id`),
  KEY `f_id` (`f_id`),
  KEY `u_id` (`u_id`),
  CONSTRAINT `favorite_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `forum` (`f_id`),
  CONSTRAINT `favorite_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `user_info` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of favorite
-- ----------------------------

-- ----------------------------
-- Table structure for `forum`
-- ----------------------------
DROP TABLE IF EXISTS `forum`;
CREATE TABLE `forum` (
  `f_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) DEFAULT NULL,
  `u_name` varchar(30) DEFAULT NULL,
  `f_title` varchar(50) DEFAULT NULL,
  `f_content` text,
  `c_id` int(11) DEFAULT NULL,
  `b_id` int(11) DEFAULT NULL,
  `t_id` int(11) DEFAULT NULL,
  `f_createtime` datetime DEFAULT NULL,
  `f_lastchangetime` datetime DEFAULT NULL,
  `f_hits` int(11) DEFAULT NULL,
  `f_ip` varchar(15) DEFAULT NULL,
  `f_state` int(11) DEFAULT NULL,
  `f_replys` int(11) DEFAULT NULL,
  `f_wordsnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`f_id`),
  KEY `u_id` (`u_id`),
  KEY `c_id` (`c_id`),
  KEY `b_id` (`b_id`),
  KEY `t_id` (`t_id`),
  CONSTRAINT `forum_ibfk_1` FOREIGN KEY (`u_id`) REFERENCES `user_info` (`u_id`),
  CONSTRAINT `forum_ibfk_2` FOREIGN KEY (`c_id`) REFERENCES `classes` (`c_id`),
  CONSTRAINT `forum_ibfk_3` FOREIGN KEY (`b_id`) REFERENCES `board` (`b_id`),
  CONSTRAINT `forum_ibfk_4` FOREIGN KEY (`t_id`) REFERENCES `topic` (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of forum
-- ----------------------------

-- ----------------------------
-- Table structure for `friend`
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `fri_id` int(11) NOT NULL AUTO_INCREMENT,
  `fri_usermasterid` int(11) DEFAULT NULL,
  `fri_userslavesid` int(11) DEFAULT NULL,
  `fri_usermastername` varchar(50) DEFAULT NULL,
  `fri_userslavesname` varchar(50) DEFAULT NULL,
  `fri_time` datetime DEFAULT NULL,
  `fri_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`fri_id`),
  KEY `fri_usermasterid` (`fri_usermasterid`),
  KEY `fri_userslavesid` (`fri_userslavesid`),
  CONSTRAINT `friend_ibfk_1` FOREIGN KEY (`fri_usermasterid`) REFERENCES `user_info` (`u_id`),
  CONSTRAINT `friend_ibfk_2` FOREIGN KEY (`fri_userslavesid`) REFERENCES `user_info` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `n_id` int(11) NOT NULL AUTO_INCREMENT,
  `n_title` varchar(40) DEFAULT NULL,
  `n_content` text,
  `n_addtime` datetime DEFAULT NULL,
  `n_changetime` datetime DEFAULT NULL,
  `n_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`n_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `q_id` int(11) NOT NULL AUTO_INCREMENT,
  `q_content` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`q_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `record_id` int(11) NOT NULL AUTO_INCREMENT,
  `record_usermasterid` int(11) DEFAULT NULL,
  `record_usermastername` varchar(50) DEFAULT NULL,
  `record_fid` int(11) DEFAULT NULL,
  `record_time` datetime DEFAULT NULL,
  PRIMARY KEY (`record_id`),
  KEY `record_fid` (`record_fid`),
  CONSTRAINT `record_ibfk_1` FOREIGN KEY (`record_fid`) REFERENCES `forum` (`f_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for `sys_menu`
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu` (
  `sm_id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_module` varchar(30) NOT NULL DEFAULT '',
  `menu_privilege` varchar(30) NOT NULL DEFAULT '',
  `sort` int(11) DEFAULT NULL,
  `menu_name` varchar(200) DEFAULT NULL,
  `title` varchar(200) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `target` varchar(20) DEFAULT NULL,
  `icon` varchar(20) DEFAULT NULL,
  `remark` text,
  PRIMARY KEY (`sm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES ('1', 'user', 'user', '100', '用户管理', '用户管理', '', 'rightFrame', '/menu/khgl.png', '');
INSERT INTO `sys_menu` VALUES ('2', 'user', 'teacher', '101', '鑰佸笀鍒楄〃', '鑰佸笀鍒楄〃', '/sysUser/listUserInfo?name=teacher', 'rightFrame', '/menu/khbf.png', '');
INSERT INTO `sys_menu` VALUES ('3', 'user', 'student', '102', '瀛︾敓鍒楄〃', '瀛︾敓鍒楄〃', '/sysUser/listUserInfo?name=student', 'rightFrame', '/menu/lxrlb.png', '');
INSERT INTO `sys_menu` VALUES ('6', 'group', 'courseware', '200', '璇句欢鍒楄〃', '璇句欢鍒楄〃', '/sysCourseware/listCoursewareInfo', 'rightFrame', '/menu/xtsz.png', '');
INSERT INTO `sys_menu` VALUES ('7', 'notice', 'notice', '201', '鍏憡绠＄悊', '鍏憡绠＄悊', '', 'rightFrame', '/menu/bmsz.png', '');
INSERT INTO `sys_menu` VALUES ('8', 'notice', 'noticelist', '202', '鍏憡鍒楄〃', '鍏憡鍒楄〃', '/sysNotice/listNoticeInfo', 'rightFrame', '/menu/rsgl.png', '');
INSERT INTO `sys_menu` VALUES ('9', 'notice', 'addnotice', '203', '鍙戝竷鍏憡', '鍙戝竷鍏憡', '/sysNotice/toAddNoticePage', 'rightFrame', '/menu/czqxz.png', '');
INSERT INTO `sys_menu` VALUES ('11', 'menu', 'menu', '205', '鑿滃崟绠＄悊', '鑿滃崟绠＄悊', '/sys/city/list.jsp', 'rightFrame', '/menu/cszl.png', '');
INSERT INTO `sys_menu` VALUES ('13', 'menu', 'secondmenu', '300', '浜岀骇鑿滃崟', '浜岀骇鑿滃崟', '', 'rightFrame', '/menu/khgjfx.png', '');
INSERT INTO `sys_menu` VALUES ('14', 'statics', 'statics', '300', '缁熻鍒嗘瀽 ', '缁熻鍒嗘瀽 ', '/report/khflfx.jsp', 'rightFrame', '/menu/khflfx.png', '');
INSERT INTO `sys_menu` VALUES ('15', 'statics', 'courseware', '302', '璇句欢鍒嗘瀽', '璇句欢鍒嗘瀽', '', 'rightFrame', '/menu/bbyfx.png', '');
INSERT INTO `sys_menu` VALUES ('17', 'statics', 'student', '303', '瀛︾敓鍒嗘瀽', '瀛︾敓鍒嗘瀽', null, 'rightFrame', '/menu/bbyfx.png', null);
INSERT INTO `sys_menu` VALUES ('18', 'user', 'addteacher', '105', '娣诲姞鑰佸笀', '娣诲姞鑰佸笀', '/sysUser/addUserInfo?name=teacher', 'rightFrame', '/menu/khccsz.png', null);
INSERT INTO `sys_menu` VALUES ('19', 'user', 'addstudent', '106', '娣诲姞瀛︾敓', '娣诲姞瀛︾敓', '/sysUser/addUserInfo?name=student', 'rightFrame', '/menu/rsgl.png', null);
INSERT INTO `sys_menu` VALUES ('20', 'group', 'course', '107', '璇剧▼鍒楄〃', '璇剧▼鍒楄〃', '/sysCourseware/listCourseInfo', 'rightFrame', '/menu/xtsz.png', null);

-- ----------------------------
-- Table structure for `topic`
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(30) DEFAULT NULL,
  `t_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(30) DEFAULT NULL,
  `u_pwd` varchar(16) DEFAULT NULL,
  `u_gender` char(2) DEFAULT NULL,
  `u_birthday` datetime DEFAULT NULL,
  `u_phone` char(11) DEFAULT NULL,
  `u_email` varchar(30) DEFAULT NULL,
  `u_addr` varchar(100) DEFAULT NULL,
  `u_face` varchar(100) DEFAULT NULL,
  `u_sign` varchar(50) DEFAULT NULL,
  `u_createtimes` datetime DEFAULT NULL,
  `q_id` int(11) DEFAULT NULL,
  `u_answer` varchar(20) DEFAULT NULL,
  `u_lastLogintime` datetime DEFAULT NULL,
  `u_level` int(11) DEFAULT NULL,
  `u_credit` int(11) DEFAULT NULL,
  `u_addtime` datetime DEFAULT NULL,
  `u_flag` int(11) DEFAULT NULL,
  `u_activeCode` char(32) DEFAULT NULL,
  `u_state` int(11) DEFAULT NULL,
  `r_id` int(11) DEFAULT NULL,
  `u_last_logintime` datetime DEFAULT NULL,
  `u_active_code` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  KEY `q_id` (`q_id`),
  KEY `r_id` (`r_id`),
  CONSTRAINT `user_info_ibfk_1` FOREIGN KEY (`q_id`) REFERENCES `question` (`q_id`),
  CONSTRAINT `user_info_ibfk_2` FOREIGN KEY (`r_id`) REFERENCES `role` (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
