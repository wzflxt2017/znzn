/*
Navicat MySQL Data Transfer

Source Server         : 密码root
Source Server Version : 50642
Source Host           : localhost:3306
Source Database       : znzn

Target Server Type    : MYSQL
Target Server Version : 50642
File Encoding         : 65001

Date: 2019-06-20 18:11:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for all_file
-- ----------------------------
DROP TABLE IF EXISTS `all_file`;
CREATE TABLE `all_file` (
  `file_id` varchar(40) NOT NULL COMMENT '文件ID',
  `file_name` varchar(400) NOT NULL COMMENT '文件名',
  `file_path` varchar(600) NOT NULL COMMENT '文件路径',
  `file_type` varchar(40) DEFAULT NULL COMMENT '文件后缀',
  `upload_user_id` varchar(40) NOT NULL COMMENT '上传用户ID',
  `upload_date` datetime DEFAULT NULL COMMENT '上传日期',
  `file_data_id` varchar(40) DEFAULT NULL COMMENT '考虑到以后可能出现多对一的情况，留一个逻辑关联字段',
  PRIMARY KEY (`file_id`),
  KEY `fk5_upload_user_id` (`upload_user_id`),
  CONSTRAINT `fk5_upload_user_id` FOREIGN KEY (`upload_user_id`) REFERENCES `sys_user` (`sys_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of all_file
-- ----------------------------
INSERT INTO `all_file` VALUES ('24731d850a0c4c7cb8845c4f71be4641', '1560505847820.jpg', '\\upload\\1560505847820.jpg', '.jpg', 'aed8f2d443764c4fb9bdbe05588fa821', '2019-06-14 17:50:48', null);
INSERT INTO `all_file` VALUES ('e28f428f0e0d48f58fd6908d87f14246', '1560505863484.jpg', '\\upload\\1560505863484.jpg', '.jpg', 'aed8f2d443764c4fb9bdbe05588fa821', '2019-06-14 17:51:03', null);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `sys_user_id` varchar(40) NOT NULL COMMENT '用户ID',
  `user_name` varchar(40) NOT NULL COMMENT '账号名',
  `password` varchar(40) NOT NULL COMMENT '密码',
  `full_name` varchar(100) NOT NULL COMMENT '昵称',
  `user_email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `user_birthday` datetime(6) DEFAULT NULL COMMENT '生日',
  `user_phone` varchar(40) DEFAULT NULL COMMENT '号码',
  `user_photo` varchar(40) DEFAULT NULL COMMENT '头像',
  `user_sign` varchar(600) DEFAULT NULL COMMENT '个性签名',
  PRIMARY KEY (`sys_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('aed8f2d443764c4fb9bdbe05588fa821', 'wangzefeng', 'e10adc3949ba59abbe56e057f20f883e', '历久弥新', '1091589902@qq.com', '1995-10-30 00:00:00.000000', '15779699577', 'e28f428f0e0d48f58fd6908d87f14246', '如果你没有战斗的能力，起码要有赴死的意识。');
INSERT INTO `sys_user` VALUES ('f23c08bd19734b97bfad65b8e41f552e', 'lixiaoting', 'bcbe3365e6ac95ea2c0343a2395834dd', '甘之如饴', null, null, null, null, null);

-- ----------------------------
-- Table structure for test_examination
-- ----------------------------
DROP TABLE IF EXISTS `test_examination`;
CREATE TABLE `test_examination` (
  `test_examination_id` varchar(40) NOT NULL COMMENT '测试试卷ID',
  `start_time` datetime DEFAULT NULL COMMENT '测试开始时间',
  `end_time` datetime DEFAULT NULL COMMENT '测试结束时间',
  `test_type_id` varchar(40) NOT NULL COMMENT '测试类型ID',
  `test_number` int(6) NOT NULL DEFAULT '0' COMMENT '分数',
  `test_grade` int(6) NOT NULL DEFAULT '1' COMMENT '等级',
  `sys_user_id` varchar(40) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`test_examination_id`),
  KEY `fk1_test_type_id` (`test_type_id`),
  KEY `fk1_sys_user_id` (`sys_user_id`),
  CONSTRAINT `fk1_sys_user_id` FOREIGN KEY (`sys_user_id`) REFERENCES `sys_user` (`sys_user_id`),
  CONSTRAINT `fk1_test_type_id` FOREIGN KEY (`test_type_id`) REFERENCES `test_type` (`test_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_examination
-- ----------------------------
INSERT INTO `test_examination` VALUES ('5bf7e0dd4a7c474a8f368ea7689077d9', '2019-06-19 14:37:45', null, '5b300492d1c0499987a0e7a83d88bc19', '0', '1', 'aed8f2d443764c4fb9bdbe05588fa821');
INSERT INTO `test_examination` VALUES ('c799e4ecb8e74ed4a4f7d170d9ed95e2', '2019-06-20 11:19:03', null, '5b300492d1c0499987a0e7a83d88bc19', '0', '1', 'aed8f2d443764c4fb9bdbe05588fa821');

-- ----------------------------
-- Table structure for test_problem_option
-- ----------------------------
DROP TABLE IF EXISTS `test_problem_option`;
CREATE TABLE `test_problem_option` (
  `test_problem_option_id` varchar(40) NOT NULL COMMENT '选项ID',
  `test_problems_id` varchar(40) NOT NULL COMMENT '测试题目ID',
  `option_title` varchar(40) NOT NULL COMMENT '选项标题，如：A、B、C、D、true、false、1、2、3',
  `option_content` varchar(500) NOT NULL COMMENT '选项正文',
  PRIMARY KEY (`test_problem_option_id`),
  KEY `fk4_test_problems_id` (`test_problems_id`),
  CONSTRAINT `fk_test_problems_id` FOREIGN KEY (`test_problems_id`) REFERENCES `test_problems` (`test_problems_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_problem_option
-- ----------------------------
INSERT INTO `test_problem_option` VALUES ('126df6797a9f440f860245b05ca0184a', '9b1d25ca9786453aab96c00714375545', 'A', '1');
INSERT INTO `test_problem_option` VALUES ('36ba89cfa15d443e9161968a0078d61c', '9b1d25ca9786453aab96c00714375545', 'C', '3');
INSERT INTO `test_problem_option` VALUES ('e2a15ce38f92423fbdc709a4ccbe079c', '9b1d25ca9786453aab96c00714375545', 'B', '2');

-- ----------------------------
-- Table structure for test_problems
-- ----------------------------
DROP TABLE IF EXISTS `test_problems`;
CREATE TABLE `test_problems` (
  `test_problems_id` varchar(40) NOT NULL COMMENT '测试题目ID',
  `test_content` varchar(1000) NOT NULL COMMENT '测试题目正文',
  `test_type_id` varchar(40) NOT NULL COMMENT '测试类型ID',
  `test_answer` varchar(40) NOT NULL COMMENT '题目答案',
  `test_number` int(6) NOT NULL DEFAULT '0' COMMENT '分数',
  `propositional_user_id` varchar(40) NOT NULL COMMENT '出题人ID',
  `propositional_date` datetime DEFAULT NULL COMMENT '出题日期',
  `degree_of_difficulty` int(6) DEFAULT '1' COMMENT '难度系数',
  PRIMARY KEY (`test_problems_id`),
  KEY `fk2_test_type_id` (`test_type_id`),
  KEY `fk2_propositional_user_id` (`propositional_user_id`),
  CONSTRAINT `fk2_propositional_user_id` FOREIGN KEY (`propositional_user_id`) REFERENCES `sys_user` (`sys_user_id`),
  CONSTRAINT `fk2_test_type_id` FOREIGN KEY (`test_type_id`) REFERENCES `test_type` (`test_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_problems
-- ----------------------------
INSERT INTO `test_problems` VALUES ('9b1d25ca9786453aab96c00714375545', '1+1', '5b300492d1c0499987a0e7a83d88bc19', 'A', '5', 'aed8f2d443764c4fb9bdbe05588fa821', '2019-06-19 14:16:28', '1');

-- ----------------------------
-- Table structure for test_record
-- ----------------------------
DROP TABLE IF EXISTS `test_record`;
CREATE TABLE `test_record` (
  `test_record_id` varchar(40) NOT NULL COMMENT '测试记录ID',
  `test_time` datetime DEFAULT NULL COMMENT '测试时间',
  `test_examination_id` varchar(40) NOT NULL COMMENT '所处试卷的id',
  `test_problems_id` varchar(40) NOT NULL COMMENT '测试题目ID',
  `test_num` int(6) NOT NULL COMMENT '第几题',
  `user_answer` varchar(40) NOT NULL COMMENT '用户答案',
  `right_answer` varchar(40) NOT NULL COMMENT '正确答案',
  `is_right` varchar(40) NOT NULL COMMENT '是否正确',
  PRIMARY KEY (`test_record_id`),
  KEY `fk3_test_examination_id` (`test_examination_id`),
  KEY `fk3_test_problems_id` (`test_problems_id`),
  CONSTRAINT `fk3_test_examination_id` FOREIGN KEY (`test_examination_id`) REFERENCES `test_examination` (`test_examination_id`),
  CONSTRAINT `fk3_test_problems_id` FOREIGN KEY (`test_problems_id`) REFERENCES `test_problems` (`test_problems_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_record
-- ----------------------------

-- ----------------------------
-- Table structure for test_type
-- ----------------------------
DROP TABLE IF EXISTS `test_type`;
CREATE TABLE `test_type` (
  `test_type_id` varchar(40) NOT NULL COMMENT '测试类型ID',
  `test_name` varchar(100) NOT NULL COMMENT '类型名称',
  `test_remark` varchar(600) DEFAULT NULL COMMENT '类型说明',
  `type_class` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`test_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_type
-- ----------------------------
INSERT INTO `test_type` VALUES ('5b300492d1c0499987a0e7a83d88bc19', '直男测试', 'upright man', 'upm');
INSERT INTO `test_type` VALUES ('5b300492d1c0499987a0e7a83d88bc20', '直女测试', 'upright woman', 'upwm');
INSERT INTO `test_type` VALUES ('5b300492d1c0499987a0e7a83d88bc21', '渣男测试', 'Player Man', 'pm');
INSERT INTO `test_type` VALUES ('5b300492d1c0499987a0e7a83d88bc22', '渣女测试', 'Player Woman', 'pw');
