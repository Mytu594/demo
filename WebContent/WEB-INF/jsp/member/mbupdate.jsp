<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改会员信息</title>
</head>
<body>
 <a href="mblist">返回</a>
  <center>修改会员信息</center>
<form id="form1" name="form1" method="post" action="mbupdate">
  <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
      <td width="116" height="30" align="right" valign="middle">账号：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="id" readonly="readonly" id="id" value="${mb.id}"/></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">成员：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="name" id="name" value="${mb.name}" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">性别：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="sex" id="sex" value="${mb.sex}" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">籍贯：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="mbnative" id="mbnative" value="${mb.mbnative}" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">专业：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="major" id="major" value="${mb.major}" /></td>
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
