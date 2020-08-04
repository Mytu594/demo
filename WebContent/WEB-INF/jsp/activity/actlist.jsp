<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>活动信息列表</title>
<script>
function frmSubmit(){
  document.form1.submit();
}
</script>
</head>
<body>
<a href="index.jsp">返回主页</a>
 <center>全部活动信息</center>
 <form id="form1" name="form1" method="post" action="actdelete">
   <table align="center" width="1200"  border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
	<tr>
	  <td>选择</td>
	  <td>活动编号</td>
	  <td>活动名</td>
	  <td>活动开始时间</td>
	  <td>活动时长</td>
	  <td>活动所属协会</td>
	  <td>活动类型</td>
	  <td>活动地点</td>
	  <td>活动招收人数</td>
	  <td>活动简介</td>
	  <td>活动已选人数</td>
	  <td>操作&nbsp;&nbsp;<a href="actpreinsert">添加</a>&nbsp;&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></td>
	</tr>
	  <c:forEach items="${actList}" var="act">
	    <tr>
	  	  <td><input type="checkbox" name="idArray" value="${act.id}"></td>
		  <td>${act.id}</td>
		  <td>${act.name}</td>
		  <td>${act.time}</td>
		  <td>${act.credit}</td>
		  <td>${act.belong}</td>
		  <td>${act.type}</td>
		  <td>${act.place}</td>
		  <td>${act.amount}</td>
		  <td>${act.detail}</td>
		  <td>${act.selected}</td>
		  <td>			
			<a href="actpreupdate?id=${act.id}&name=${act.name}&time=${act.time}&credit=${act.credit}&belong=${act.belong}&type=${act.type}&place=${act.place}&amount=${act.amount}&detail=${act.detail}&selected=${act.selected}">修改</a>
		  </td>
	    </tr>
	  </c:forEach>
    </table>
  </form>
</body>
</html>
