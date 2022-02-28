<html>
<body>
<h2>Do Supervisor Revision</h2>
<hr>
<#if task.descriptions[0]??>
Description: ${task.descriptions[0].text}<BR/>
</#if>
in_name: ${in_name}<BR/>
in_email: ${in_email}<BR/>
out_commentRevision: ${out_commentRevision}<BR/>
<form action="complete" method="POST" enctype="multipart/form-data">
out_approvation: <input type="text" name="out_approvation" /><BR/>
<BR/>
<input type="submit" name="outcome" value="Complete"/>
</form>
</body>
</html>