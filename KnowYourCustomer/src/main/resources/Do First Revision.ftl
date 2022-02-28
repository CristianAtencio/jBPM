<html>
<body>
<h2>Do First Revision</h2>
<hr>
<#if task.descriptions[0]??>
Description: ${task.descriptions[0].text}<BR/>
</#if>
in_age: ${in_age}<BR/>
in_name: ${in_name}<BR/>
in_email: ${in_email}<BR/>
in_phoneNumber: ${in_phoneNumber}<BR/>
in_lastName: ${in_lastName}<BR/>
<form action="complete" method="POST" enctype="multipart/form-data">
out_dataCompleted: <input type="text" name="out_dataCompleted" /><BR/>
out_commentRevision: <input type="text" name="out_commentRevision" /><BR/>
<BR/>
<input type="submit" name="outcome" value="Complete"/>
</form>
</body>
</html>