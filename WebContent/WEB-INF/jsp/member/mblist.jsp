<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>协会会员信息列表</title>
<script>
function frmSubmit(){
  document.form1.submit();
}
</script>
</head>
<body>
   <a href="index.jsp" class="btn btn-default">返回主页</a>
 <center>全部会员信息</center>
 <form id="form1" name="form1" method="post" action="mbdelete">
   <table align="center" width="800" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
	<tr>
	  <td>选择</td>
	  <td>账号</td>
	  <td>姓名</td>
	  <td>性别</td>
	  <td>籍贯</td>
	  <td>专业</td>
	  <td>操作&nbsp;&nbsp;<a href="mbpreinsert">添加</a>&nbsp;&nbsp;<a href="#" onclick="javascript:frmSubmit();">删除</a></td>
	</tr>
	  <c:forEach items="${mbList}" var="mb">
	    <tr>
	  	  <td><input type="checkbox" name="idArray" value="${mb.id}"></td>
		  <td>${mb.id}</td>
		  <td>${mb.name}</td>
		  <td>${mb.sex}</td>
		  <td>${mb.mbnative}</td>
		  <td>${mb.major}</td>
		  <td>			
			<a href="mbpreupdate?id=${mb.id}&name=${mb.name}&sex=${mb.sex}&mbnative=${mb.mbnative}&major=${mb.major}">修改</a>
		  </td>
	    </tr>
	  </c:forEach>
    </table>
  </form>
</body>
</html>