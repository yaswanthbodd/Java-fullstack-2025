<jsp:useBean id="emp" class="mypack.Employee" scope="session"/>
<table border>
	<tr>
		<th>Employee Number</th>
		<th>Employee Name</th>
		<th>Employee Salary</th>
	</tr>
	<tr>
		<td><jsp:getProperty name="emp" property="eno"/></td>
		<td><jsp:getProperty name="emp" property="ename"/></td>
		<td><jsp:getProperty name="emp" property="salary"/></td>
	</tr>
</table>