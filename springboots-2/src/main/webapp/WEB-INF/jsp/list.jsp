<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<script type="text/javascript"
	src="${APP_PATH}/static/jquery-3.3.1/jquery-3.3.1.js"></script>
	
</head>
<body>
<script type="text/javascript" >
	$(function () {
		$.ajax({
			 url:"${APP_PATH}/hello",
   		  data:"",
   		  type:"GET",
   		  success:function(result){
   			//1. 解析并显示员工数据
   			//console.log(result);
   			build_emps_table(result)
   			}
   			
		});
		
	});
    function build_emps_table(result){
 	   //清空表格
 	   $("#emps_table tbody").empty();
 	   var emps=result.lists;
 	   $.each(emps,function(index,item){
 		   //alert(item.empName);
 		   var roleIdTd=$("<td></td>").append(item.role_id);
 	
 		   $("<tr></tr>").append(roleIdTd)
 		   
 		   .appendTo("#emps_table tbody");
 	   });
    }
	
	</script>
	<a>asfg</a>
</body>
</html>