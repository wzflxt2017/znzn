-- 用户表
CREATE TABLE sys_user (
	`sys_user_id` VARCHAR (40) NOT NULL COMMENT '用户ID',
	`user_name` VARCHAR (40) NOT NULL COMMENT '账号名',
	`password` VARCHAR (40) NOT NULL COMMENT '密码',
	`full_name` VARCHAR (100) NOT NULL COMMENT '昵称',
	`user_email` VARCHAR (100) COMMENT '邮箱',
	`user_birthday` datetime (6) COMMENT '生日',
	`user_phone` VARCHAR (40) COMMENT '号码',
	`user_photo` VARCHAR (40) COMMENT '头像',
	`user_sign` VARCHAR (600) COMMENT '个性签名',
	PRIMARY KEY (`sys_user_id`)
) ENGINE = INNODB charset = utf8;

-- 测试类型表
CREATE TABLE test_type (
	`test_type_id` VARCHAR (40) NOT NULL COMMENT '测试类型ID',
	`test_name` VARCHAR (100) NOT NULL COMMENT '类型名称',
	`test_remark` VARCHAR (600) COMMENT '类型说明',
	PRIMARY KEY (`test_type_id`)
) ENGINE = INNODB charset = UTF8;
-- 试卷表
CREATE TABLE test_examination (
	`test_examination_id` VARCHAR (40) NOT NULL COMMENT '测试试卷ID',
	`start_time` datetime COMMENT '测试开始时间',
	`end_time` datetime COMMENT '测试结束时间',
	`test_type_id` VARCHAR (40) NOT NULL COMMENT '测试类型ID',
	`test_number` INT (6) NOT NULL DEFAULT 0 COMMENT '分数',
	`test_grade` INT (6) NOT NULL DEFAULT 1 COMMENT '等级',
	`sys_user_id` VARCHAR (40) NOT NULL COMMENT '用户ID',
	PRIMARY KEY (`test_examination_id`),
	KEY `fk1_test_type_id` (`test_type_id`),
	KEY `fk1_sys_user_id` (`sys_user_id`),
	CONSTRAINT `fk1_test_type_id` FOREIGN KEY (`test_type_id`) REFERENCES `test_type` (`test_type_id`),
	CONSTRAINT `fk1_sys_user_id` FOREIGN KEY (`sys_user_id`) REFERENCES `sys_user` (`sys_user_id`)
) ENGINE = INNODB charset = utf8;
-- 题目表
CREATE TABLE test_problems (
	`test_problems_id` VARCHAR (40) NOT NULL COMMENT '测试题目ID',
	`test_content` VARCHAR (1000) NOT NULL COMMENT '测试题目正文',
	`test_type_id` VARCHAR (40) NOT NULL COMMENT '测试类型ID',
	`test_answer` VARCHAR (40) NOT NULL COMMENT '题目答案',
	`test_number` INT (6) NOT NULL DEFAULT 0 COMMENT '分数',
	`propositional_user_id` VARCHAR (40) NOT NULL COMMENT '出题人ID',
	`propositional_date` datetime COMMENT '出题日期',
	`degree_of_difficulty` INT (6) DEFAULT 1 COMMENT '难度系数',
	PRIMARY KEY (`test_problems_id`),
	KEY `fk2_test_type_id` (`test_type_id`),
	KEY `fk2_propositional_user_id` (`propositional_user_id`),
	CONSTRAINT `fk2_test_type_id` FOREIGN KEY (`test_type_id`) REFERENCES `test_type` (`test_type_id`),
	CONSTRAINT `fk2_propositional_user_id` FOREIGN KEY (`propositional_user_id`) REFERENCES `sys_user` (`sys_user_id`)
) ENGINE = INNODB charset = utf8;
-- 测试记录表
CREATE TABLE test_record (
	`test_record_id` VARCHAR (40) NOT NULL COMMENT '测试记录ID',
	`test_time` datetime COMMENT '测试时间',
	`test_examination_id` VARCHAR (40) NOT NULL COMMENT '所处试卷的id',
	`test_problems_id` VARCHAR (40) NOT NULL COMMENT '测试题目ID',
	`test_num` INT (6) NOT NULL COMMENT '第几题',
	`user_answer` VARCHAR (40) NOT NULL COMMENT '用户答案',
	`right_answer` VARCHAR (40) NOT NULL COMMENT '正确答案',
	`is_right` VARCHAR (40) NOT NULL COMMENT '是否正确',
	PRIMARY KEY (`test_record_id`),
	KEY `fk3_test_examination_id` (`test_examination_id`),
	KEY `fk3_test_problems_id` (`test_problems_id`),
	CONSTRAINT `fk3_test_examination_id` FOREIGN KEY (`test_examination_id`) REFERENCES `test_examination` (`test_examination_id`),
	CONSTRAINT `fk3_test_problems_id` FOREIGN KEY (`test_problems_id`) REFERENCES `test_problems` (`test_problems_id`)
) ENGINE = INNODB charset = utf8;
-- 题目选项表
CREATE TABLE test_problem_option (
	`test_problem_option_id` VARCHAR (40) NOT NULL COMMENT '选项ID',
	`test_problems_id` VARCHAR (40) NOT NULL COMMENT '测试题目ID',
	`option_title` VARCHAR (40) NOT NULL COMMENT '选项标题，如：A、B、C、D、true、false、1、2、3',
	`option_content` VARCHAR (500) NOT NULL COMMENT '选项正文',
	PRIMARY KEY (`test_problem_option_id`),
	KEY `fk4_test_problems_id`(`test_problems_id`),
	CONSTRAINT `fk_test_problems_id` FOREIGN KEY (`test_problems_id`) REFERENCES `test_problems` (`test_problems_id`)
) ENGINE = INNODB charset = utf8;
-- 文件表
CREATE TABLE all_file (
	`file_id` VARCHAR (40) NOT NULL COMMENT '文件ID',
	`file_name` VARCHAR (400) NOT NULL COMMENT '文件名',
	`file_path` VARCHAR (600) NOT NULL COMMENT '文件路径',
	`file_type` VARCHAR (40) COMMENT '文件后缀',
	`upload_user_id` VARCHAR (40) NOT NULL COMMENT '上传用户ID',
	`upload_date` datetime COMMENT '上传日期',
	`file_data_id` VARCHAR (40) COMMENT '考虑到以后可能出现多对一的情况，留一个逻辑关联字段',
	PRIMARY KEY (`file_id`),
	KEY `fk5_upload_user_id`(`upload_user_id`),
	CONSTRAINT `fk5_upload_user_id` FOREIGN KEY (`upload_user_id`) REFERENCES `sys_user` (`sys_user_id`)
) ENGINE = INNODB charset = utf8;



INSERT INTO `znzn`.`test_type` (`test_type_id`, `test_name`, `test_remark`, `type_class`) VALUES ('5b300492d1c0499987a0e7a83d88bc19', '直男测试', 'upright man', 'upm');
INSERT INTO `znzn`.`test_type` (`test_type_id`, `test_name`, `test_remark`, `type_class`) VALUES ('5b300492d1c0499987a0e7a83d88bc20', '直女测试', 'upright woman', 'upwm');
INSERT INTO `znzn`.`test_type` (`test_type_id`, `test_name`, `test_remark`, `type_class`) VALUES ('5b300492d1c0499987a0e7a83d88bc21', '渣男测试', 'Player Man', 'pm');
INSERT INTO `znzn`.`test_type` (`test_type_id`, `test_name`, `test_remark`, `type_class`) VALUES ('5b300492d1c0499987a0e7a83d88bc22', '渣女测试', 'Player Woman', 'pw');
