<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    
	<title>Danapani</title>
</head>
<body>
	<div class="header">
		<div class ="header_Left_logo"> 
			<table>
				<tbody>
					<tr>
					</tr>
				</tbody>
			</table>
		</div>
		<div class ="header_right_sign">
			<form action="login.htm" method="post">
				<table>
					<tbody>
						<tr>
							<td class="login_form_sign_email">
							   <label for="email"> Email or Phone</label>
							</td>
							<td class="login_form_sign_pass">
	    						<label for="pass">Password </label>
							</td>
						</tr>
						<tr>
							<td>
								<input class="inputtext" name="email" id="email" value="" tabindex="1" type="text">
							</td>
							<td>
								<input class="inputtext" name="pass" id="pass" tabindex="2" type="password">
							</td>
							<td>
								<label class="uiButton_ButtonConfirm" id="loginbutton">
									<input value="Log In" tabindex="3" id="login_submit" type="submit">
								</label>
							</td>
						</tr>
							
						<tr>
							<td >
								
							</td>
							<td class="login_form_label_field">
								<a href="www.danapani.com/login_Check">Forgot your password?</a>
							</td>
						</tr>	
					</tbody>
				</table>
			</form>
		</div>
	</div>
	<div class="nav">
	</div>
	<div class="section">
		<div class="section_left"></div>
		<div class="section_right">
			<div>
					<form action="danapani.jsp/Home" method="post" name ="reg" id="reg" >
						<div> 
							<input type="text" class="reg_text" name="reg_Group Name" value ="Group Name" tabindex="">
						</div>
						
						<div>
							
							<input type="text" class="reg_text" name="reg_Email" value ="Email-id" tabindex="">
						</div>
						
						<div> 
							<input type="password" class="reg_text" name="reg_Password" value ="Password" tabindex="">
						</div>
						
						<div> 
							<input type="password" class="reg_text" name="reg_Confirm_Password" value ="Confirm Password" tabindex="">
						</div>
						
						<div> 
							<input type="text" class="reg_text" name="reg_phone" value ="Phone Number" tabindex="">
						</div>
						<div> 
							 Member's Count :
								<select name="Members"tabindex="">
									<option >1
									<option>2
									<option>3
									<option selected>4
									<option>5
									<option>6
									<option>7
									<option>8
									<option>9
									<option>10
								</select> 
						</div>
						<div>
								<input value="Sign Up" id="login_submit" type="submit" tabindex="">
						</div>		
						
						
						
					
					
					</form>			
			</div>
		</div>
	</div>
	<div class="footer">
	</div>
</body>
</html>