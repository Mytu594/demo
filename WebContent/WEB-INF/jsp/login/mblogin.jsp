<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理员登录页面</title>
</head>
<body>
<a href="index.jsp">返回主页</a>
<p>用户登录请输入账号密码（默认admin)</p>
<form id="form1" name="form1" method="post" action="adminlogin">
  <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
      <td width="116" height="30" align="right" valign="middle">账号：</td>
      <td width="378" align="left" valign="middle" >
      <input type="text" name="id" id="id" value="admin"/></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">密码：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="pwd" id="pwd" value="123456"/></td>
    </tr>
    <tr>
      <td height="30" align="right" valign="middle">&nbsp;</td>
      <td align="left" valign="middle"><input type="submit" name="button" id="button" value="登录" />
      <input type="reset" name="button2" id="button2" value="重置" /></td>
    </tr>
  </table>
</form>
</body>
</html>