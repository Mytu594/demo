<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改协会信息</title>
</head>
<body>
 <a href="clublist">返回</a>
 <center>修改协会信息</center>
<form id="form1" name="form1" method="post" action="clubupdate">
  <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
      <td width="116" height="30" align="right" valign="middle">编号：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="id" readonly="readonly" id="id" value="${club.id}"/></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">名称：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="name" id="name" value="${club.name}" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">会长：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="man" id="man" value="${club.man}" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">电话：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="tel" id="tel" value="${club.tel}" /></td>
    </tr>
    <tr>
      <td height="30" align="right" valign="middle">&nbsp;</td>
      <td align="left" valign="middle"><input type="submit" name="button" id="button" value="提交" />
      <input type="reset" name="button2" id="button2" value="重置" /></td>
    </tr>
  </table>
</form>
</body>
</html>
