<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>添加成员活动信息</title>
</head>
<body>
<a href="actlist">返回</a>
<center>活动信添加息</center>
<form id="form1" name="form1" method="post" action="actinsert">
   <table align="center" width="500" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse" bordercolor="#0099FF">
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动号：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="id" id="id" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动名：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="name" id="name" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动开始时间：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="time" id="time" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动时长：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="credit" id="credit" /></td>
    </tr>
     <td width="116" height="30" align="right" valign="middle">活动所属协会：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="belong" id="belong" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动类型：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="type" id="type" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动地点：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="place" id="place" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动招收人数：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="amount" id="amount" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动简介：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="detail" id="detail" /></td>
    </tr>
    <tr>
      <td width="116" height="30" align="right" valign="middle">活动已选人数：</td>
      <td width="378" align="left" valign="middle">
      <input type="text" name="select" id="select" /></td>
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
