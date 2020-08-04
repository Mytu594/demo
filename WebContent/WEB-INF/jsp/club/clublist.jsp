<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>协会信息列表</title>
<script>
function frmSubmit(){
  document.form1.submit();
}
</script>
</head>
<body>
  <a href="index.jsp">返回主页</a>
 <center>全部协会信息</center>
 <form id="form1" name="form1" method="post" action="clubdelete">
   <table align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
	<tr>
	  <td>选择</td>
	  <td>编号</td>
	  <td>名称</td>
	  <td>会长</td>
	  <td>电话</td>
	  <td>操作&nbsp;&nbsp;<a href="clubpreinsert">添加</a>&nbsp;&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></td>
	</tr>
	  <c:forEach items="${clubList}" var="club">
	    <tr>
	  	  <td><input type="checkbox" name="idArray" value="${club.id}"></td>
		  <td>${club.id}</td>
		  <td>${club.name}</td>
		  <td>${club.man}</td>
		  <td>${club.tel}</td>
		  <td>			
			<a href="clubpreupdate?id=${club.id}&name=${club.name}&man=${club.man}&tel=${club.tel}">修改</a>
		  </td>
	    </tr>
	  </c:forEach>
    </table>
  </form>
</body>
</html>