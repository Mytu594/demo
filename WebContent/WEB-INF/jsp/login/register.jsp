<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
  <a href="index.jsp">返回主页</a>
  <center>注册页面</center>
<form id="form1" name="form1" method="post" action="admininsert">
  <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
      <td width="116" height="30" align="right" valign="middle">账号：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="id" id="id" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">密码：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="pwd" id="pwd" /></td>
    </tr>
    <tr>
      <td height="30" align="right" valign="middle">&nbsp;</td>
      <td align="left" valign="middle"><input type="submit" name="button" id="button" value="注册" />
      <input type="reset" name="button2" id="button2" value="重置" /></td>
    </tr>
  </table>
</form>
</body>
</html>