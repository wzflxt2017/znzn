**用户管理模块（user manage）：
  包名：user
  所有表名：sys_user,test_type,test_record,test_examination,test_problem,test_problem_option,all_file
  sys_user:
  	sys_user_id,user_name,password,full_name,user_email,user_birthday,user_phone,user_photo,user_sign(用户个性签名)
  test_type:
  	test_type_id,test_name,test_type,test_remark
  test_record:
  	test_record_id,test_count_id(所处答卷的id),test_time,test_type,test_num(测试题目的序号),user_answer,right_answer,is_right
  test_examination:
  	test_eamination_id,start_time,end_time,test_number(分数),test_grade(等级),sys_user_id
  test_problems:
  	test_problems_id,test_num(序号),test_content,test_type,test_answer,test_number(分数),propositional_user_id,propositional_date,degree_of_difficulty(难度系数)
  test_problem_option,
  	test_problem_option_id,test_problems_id,option_title,option_content
  all_file:
  	file_id,file_name,file_path,file_type,upload_user_id,upload_date,file_data_id(考虑到以后可能出现多对一的情况，留一个逻辑关联字段)**