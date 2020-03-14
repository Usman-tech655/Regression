package com.key2act.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 * @author ukarim
 *
 */
public class MasterPageFactory {
	WebDriver driver;
	WebDriverWait wait;

	public MasterPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
		wait = new WebDriverWait(driver, 20);

	}

	@FindBy(xpath="//*[@id='email']")
	private List<WebElement> email;
	@FindBy(xpath="//*[@id='password']")
	private List<WebElement> pass;
	//@FindBy(xpath="//*[@class='AuthCore_buttonContainer__p3GQ0\']")
	@FindBy(xpath="//span[text()='Sign In']")
	private List <WebElement> singin;
	@FindBy(xpath="//*[@id='password']")
	private List <WebElement>singuppass;
	@FindBy(xpath="//span[text()='Sign Up']")
	private List<WebElement>signup;
	@FindBy(xpath="//*[@id='firstName']")
	private List<WebElement> signupfirst;
	@FindBy(xpath="//*[@id='lastName']")
	private List <WebElement> signuplast;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>emailsignup;
	@FindBy(xpath="//*[@id='phone']")
	List <WebElement> signuphone;
	@FindBy(xpath="//*[@id='confirmPassword']")
	private List <WebElement> signupconfirm;
	@FindBy(xpath="//span[text()='Sign Up']")
	private List <WebElement> hitsignup;
	@FindBy(xpath="(//span[text()=concat('Jabbot',\"'\",'s Company')])[2]")
	private List<WebElement>company;
	@FindBy(xpath="(//button[@type='button'])[3]")
	private List <WebElement> change;
	@FindBy(xpath="//*[@id='password']")
	private List <WebElement>update;
	@FindBy(xpath="//*[@id='newPassword']")
	private List <WebElement>newpass;
	@FindBy(xpath="//text()[contains(.,'+ Create New Company')]/ancestor::li[1]")
	private List <WebElement> createc;
	public List<WebElement> getCreatec() {
		return createc;
	}

	@FindBy(xpath="//a[text()='Architect']")
	private  WebElement Architect;
	@FindBy(xpath="//*[text()='Update']")
	private List<WebElement>create1;
	//@FindBy(xpath="//*[@id='name']")
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> cname;
	@FindBy(xpath="//*[@id='select-contractorName']")
	public List<WebElement>ctr;
	@FindBy(xpath="//text()[.='Mechanical Service Provider – Commercial']/ancestor::li[1]")
	private List<WebElement>type;
	@FindBy(xpath="//*[@id='addressSearch']")
	private List<WebElement>address;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>create;
	//@FindBy(xpath="//*[@id='root']/div/header/button/i")
	@FindBy(xpath="(//i[text()='apps'])[1]")
	private List <WebElement> Menu;
	@FindBy(xpath="//a[text()='Home']")
	private List<WebElement>Home;
	@FindBy(xpath="//a[text()='Admin']")
	private List<WebElement>Admin;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement>Billing;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>billingemail;
	@FindBy(xpath="//*[@id='phone']")
	private List<WebElement>billingphone;
	@FindBy(xpath="//*[@id='address1']")
	private List<WebElement>billingadd;
	@FindBy(xpath="//*[@id='city']")
	private List<WebElement>billingcity;
	@FindBy(xpath="//*[@id='state']")
	private List<WebElement>billingstate;
	@FindBy(xpath="//*[@id='zip']")
	private List<WebElement>billingzip;
	@FindBy(xpath="//span[text()='Save']")
	private List <WebElement>billingsave;
	@FindBy(xpath="(//button[@type= 'button'])[1]")
	private List <WebElement> drop;
	@FindBy (xpath="//*[text()='Edit Billing Information']")
	private List <WebElement>editcompany;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> editname;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>editemail;
	@FindBy(xpath="//*[@id='phone']")
	private List<WebElement>editphone;
	@FindBy(xpath="//*[@id='address1']")
	public List<WebElement>editadd;
	@FindBy(xpath="//*[@id='city']")
	private List<WebElement>editcity;
	@FindBy(xpath="//*[@id='state']")
	public List<WebElement> editstate;
	@FindBy(xpath="//*[@id='zip']")
	public List<WebElement> editzip;
	@FindBy(xpath="//button[@type='submit']")
	private List<WebElement> editsave;
	@FindBy (xpath="//span[text()='Manage Roles']") 
	private List<WebElement> userole;
	@FindBy(xpath="//text()[.='New Role']/ancestor::button[1]")
	private List<WebElement> createrole;
	@FindBy(xpath="//input[@type='text'][@name='name']")
	private List <WebElement> rolename;
	@FindBy(xpath="//input[@type='text'][@name='description']")
	private List <WebElement> roledes;
	@FindBy (xpath="//span[text()='Create']")
	private List<WebElement>rolesave;
	@FindBy(xpath="//*[@id='select-role']")
	private List <WebElement>editrole;
	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
	private List<WebElement> editwrite;
	@FindBy(xpath="//text()[.='read']/ancestor::li[1]")
	private List<WebElement>editread;
	@FindBy(xpath="(//button[@class='ActionBarItem_button__Dekv1'])[3]")
	private List <WebElement>deletrole;
	@FindBy(xpath="//span[text()='Confirm']")
	private List <WebElement> roledel;
	@FindBy(xpath="//button[text()='Edit Role']")
	private List<WebElement>editrole1;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> editrolename;
	@FindBy(xpath="//*[@id='description']")
	private List <WebElement>editroledes;
	@FindBy(xpath="//*[@data-test-id='confirm']")
	private List<WebElement>editrolesave;
	@FindBy(xpath="//*[@class='fas fa-caret-down']")  
	public List<WebElement> editcompanyy;
	@FindBy(xpath="(//li[@role='menuitem'])[1]")
	private List<WebElement> editjcompany;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement>editjcompanyname;
	@FindBy(xpath="//*[@id='addressSearch']")
	private List<WebElement> editjadd;
	@FindBy(xpath="//span[text()='Edit']")
	private List <WebElement> editjsave;
	@FindBy(xpath="//span[text()='Manage Users']")
	private List <WebElement>manageuser;
	@FindBy(xpath="//text()[.='Invite Users']/ancestor::button[1]")
	private List <WebElement>inviteuser;
	@FindBy(xpath="//*[@id='email']")
	private List <WebElement> inviteemail;
	@FindBy(xpath="((//text()[.='​']/ancestor::div[2])[2]")
	private List <WebElement>inviterole;
	@FindBy(xpath="//text()[.='Read Only']/ancestor::li[1]") 
	private List <WebElement>roleselect;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>createuser;
	@FindBy(xpath="//span[text()='Manage Roles']")
	private List<WebElement>managerol;
	@FindBy(xpath="//text()[.='Manage User']/ancestor::li[1]")
	private List <WebElement>rolechange;
	@FindBy(xpath="//div[text()='Read Only']")
	private List <WebElement>manageuserole;
	@FindBy (xpath="//text()[.='Admin']/ancestor::li[1]")
	private List <WebElement>unewrole;
	@FindBy(xpath="//span[text()='Save']")
	private List<WebElement>newrolesave;
	@FindBy(xpath="//text()[.='Remove User']/ancestor::li[1]")
	private List<WebElement>removeuser;
	@FindBy(xpath="//a[text()='IoT Hub']")
	private List<WebElement>iot;
	@FindBy(xpath="//span[text()='Manage BAS Agents']")
	private List <WebElement>iot1;
	@FindBy(xpath="//button[text()='New Agent']")
	private List<WebElement> IotNA;
	@FindBy(xpath="//*[@id='name']")
	private List<WebElement> CreateAgent;
	@FindBy(xpath="//*[@id='serialNumber']")
	private List<WebElement>Aserial;
	@FindBy(xpath="//span[text()='Create']")
	private List<WebElement>ASave;
	@FindBy(xpath="(//*[@class='fas fa-ellipsis-h'])[19]")
	private List<WebElement>Agentellipsis;
	@FindBy(xpath="//text()[.='Assign Agent']/ancestor::li[1]")
	private List<WebElement>AgentAssign;
	//@FindBy(xpath="//li[text()='Manage Agent']")
	@FindBy(xpath="//*[contains(text(),'Manage Agent')]")
	private List <WebElement>ManageA;
	@FindBy(xpath="//span[text()='View BAS Inventory']")
	private WebElement ViewBas;
	@FindBy(xpath="(//span[text()='Configure BAS Network'])[1]")
	private List<WebElement>config;
	@FindBy(xpath="//span[text()='Reboot Agent']")
	private List<WebElement>rebootA;
	@FindBy(xpath="//*[text()='Restart Application']")
	private List<WebElement> restartA;
	@FindBy(xpath="//*[text()='Ping Agent']")
	private List<WebElement>pingA;
	@FindBy(xpath="//*[text()='Rename Agent']")
	private List<WebElement>Arename;
	//Close Rename popup
	@FindBy(xpath="//*[@class='fa fa-times']")
	private List<WebElement>closepop;
	@FindBy(xpath="//*[text()='Update Agent Time Zone']")
	private List<WebElement>UpDateTime;
	@FindBy(xpath="//*[@id='select-timeZone']")
	private List<WebElement>ATimezone;
	@FindBy(xpath="//li[text()='America/Nipigon']")
	private List<WebElement>ATime;
	@FindBy(xpath="//*[text()='Cancel']")
	private List<WebElement>TimeC;
	@FindBy(xpath="//*[text()='Assign Agent']")
	private List<WebElement>Assign;
	@FindBy(xpath="//*[@id='serialNumber']")
	private List<WebElement>ASerial;
// Need to remove this below xpath after getting the serial num
	@FindBy(xpath="//*[@class='fa fa-times']")
	private List<WebElement>closeAssign;
	@FindBy(xpath="//*[text()='Factory Reset']")
	private List <WebElement>AFreset;
	@FindBy(xpath="//*[@id='reset']")
	private List <WebElement>ResetAgent;
	@FindBy(xpath="//*[text()='confirm']")
	private List<WebElement>ConfirmR;
	@FindBy(xpath="//*[text()='Delete Agent']")
	private List<WebElement>DeleteA;
	@FindBy(xpath="//*[@id='delete']")
	private List<WebElement>WriteDel;
	@FindBy(xpath="//*[text()='confirm']")
	private List<WebElement>ConfirmDel;
	@FindBy(xpath="//button[text()='Forgot Password?']")
	private List<WebElement>forgot;
	@FindBy(xpath="//*[@id='email']")
	private List<WebElement>frgtemail;
	@FindBy(xpath="//span[text()='Reset Password']")
	private List<WebElement>frgtreset;
	@FindBy(xpath="//*[@class='fas fa-bars']")
	private List<WebElement>signObar;
	@FindBy(xpath="//*[text()='Sign Out']")
	private List<WebElement>signout;
	public void Wait() {
		wait.until(ExpectedConditions.visibilityOf((WebElement) Menu));


	}
	public void waite() {
		wait.until(ExpectedConditions.elementToBeClickable((By) billingsave));
	}
	
	//Home
	@FindBy(xpath="(//img[@src='/assets/images/subscribeIconOutline.svg'])[8]")
	private WebElement Subclient;	
	@FindBy(xpath="//*[@name='email']")
	private WebElement CheckBox;
	@FindBy(xpath=("//*[@name='sms']"))
	private WebElement SmsBox;
	@FindBy(xpath="//span[text()='Subscribe']")
	private WebElement SubSave;
	
	
	//Subscriptions
	@FindBy(xpath="//a[text()='Subscriptions']")
	private WebElement sub;
	@FindBy(xpath="(//*[@class='fas fa-ellipsis-h'])[1]")
	private WebElement SubElsp;
	@FindBy(xpath="//li[text()='Unsubscribe']")
	private WebElement UnSubUser;
	@FindBy(xpath="//img[@src='/assets/images/ContactSubscriptionsIconOutline.svg']")
	private WebElement ClientSub;
	@FindBy(xpath="(//*[@class='fas fa-ellipsis-h'])[1]")
	private WebElement ClientElp;
	@FindBy(xpath="//li[text()='Unsubscribe']")
	private WebElement ClientUnSub;
	
	// Architect
	@FindBy(xpath="//*[text()='New Entity']")
	private WebElement Entity;
	@FindBy(xpath="//*[text()='Client']")
	private WebElement Client;
	@FindBy(xpath="//input[@id='clientName']")
	private WebElement CrtClient;
	@FindBy(xpath="(//text()[.='​']/ancestor::div[1])[3]")
	private WebElement BusinessT;
	@FindBy(xpath="//li[text()='Construction']")
	private WebElement SelectBusiness;
	@FindBy(xpath="//*[@id='addressSearch']")
	private WebElement searchAdd;
	@FindBy(xpath="//span[text()='713 Bergen Avenue, Jersey City, NJ, USA']")
	private WebElement selectaddres;
	@FindBy(xpath="//span[text()='Create']")
	private WebElement ClientSave;
	//Client Site
	@FindBy(xpath="//*[text()='Usman Client']")
	private WebElement Site;
	@FindBy(xpath="//*[text()='Create a new Site']")
	private WebElement Usmansite;
	@FindBy(name="name")
	private WebElement Sitename;
	@FindBy(id="select-buildingType")
	private WebElement SiteType;	
	@FindBy(xpath="//li[text()='Fast Food Restaurant']")
	private WebElement SiteType1;
	@FindBy(xpath="//*[@id='squareFootage']")
	private WebElement SFoot;
	@FindBy(xpath="//*[@id='select-fuelTypes']")
	private WebElement FuelTypes;
	@FindBy(xpath="//span[text()='Natural Gas']")
	private WebElement SelectFT;
	@FindBy(xpath="//input[@type='text'][@name='name']")
	private WebElement Tab;
	@FindBy(xpath="//span[text()='Create a new Campus']")
	private WebElement Campus;
	@FindBy(xpath="//*[@id='select-clientName']")
	private WebElement ClName;
	@FindBy(xpath="//span[text()='Usman Client']")
	private WebElement CleintName;
	@FindBy(xpath="//input[@id='campusName']")
	private WebElement CampusName;
	@FindBy(xpath="//span[text()='Create']")
	private WebElement CampusSave;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[17]/span[1]/i[1]")
	private WebElement ClientDrp;
	@FindBy(xpath="//span[text()=concat('Usman',\"'\",'s Fav Food')]	")
	private WebElement eqp;
	@FindBy(xpath="//span[text()='Create a new Equipment']")
	private WebElement CreateEqp;
	@FindBy(xpath="//*[@id='select-client']")
	private WebElement ClientNameDrp;
	@FindBy(xpath="(//text()[.='Usman Client']/ancestor::li[1])[2]")
	private WebElement SelectClnt;
	@FindBy(xpath="//*[@id='select-site']")
	private WebElement SelectSite;
	@FindBy(xpath="//text()[.=concat('Justin',\"'\",'s House')]/ancestor::li[1]")
	private WebElement SelectSiteName;
	@FindBy(xpath="//*[@id='name']")
	private WebElement GiveName;
	@FindBy(xpath="//*[@id='select-equipmentType']")
	private WebElement EqpType;
	@FindBy(xpath="//*[text()='Blower Coil']")
	private WebElement EqpTypeSelect;
	@FindBy(xpath="//span[text()='Create']")
	private WebElement EqpSave;
	@FindBy(xpath="//*[@class='jss262 jss523 jss526 jss531 jss532 jss520 jss521 CreateEntityModal_selectMenuItem__2Lg6t']")
	private WebElement DropDownCancel;
			






	//Getter



	
	public List<WebElement> getSignout() {
		return signout;
	}
	public List<WebElement> getEmailsignup() {
		return emailsignup;
	}


	public List<WebElement> getSignupfirst() {
		return signupfirst;
	}

	public List<WebElement> getSignuplast() {
		return signuplast;
	}
	public List<WebElement> getSignup() {
		return signup;
	}
	public List<WebElement> getEmail() {
		return email;
	}


	public List<WebElement> getSignuphone() {
		return signuphone;
	}

	public List<WebElement> getSinguppass() {
		return singuppass;
	}

	public List<WebElement> getSignupconfirm() {
		return signupconfirm;
	}
	public List<WebElement> getPass() {
		return pass;
	}


	public List<WebElement> getHitsignup() {
		return hitsignup;
	}
	public List<WebElement> getSingin() {
		return singin;
	}


	public List<WebElement> getChange() {
		return change;
	}

	public List<WebElement> getUpdate() {
		return update;
	}

	public List<WebElement> getNewpass() {
		return newpass;
	}

	public List<WebElement> getCreate1() {
		return create1;
	}

	public List<WebElement> getCompany() {
		return company;
	}


	public List<WebElement> getCname() {
		return cname;
	}

	public List<WebElement> getContractor() {
		return ctr;
	}
	

	public WebElement getArchitect() {
		return Architect;
	}
	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getType() {
		return type;
	}

	public List<WebElement> getCreate() {
		return create;
	}

	public List<WebElement> getMenu() {
		return Menu;
	}

	public List<WebElement> getDrop() {
		return drop;
	}


	public List<WebElement> getHome() {
		return Home;
	}
	public List<WebElement> getAdmin() {
		return Admin;
	}

	public List<WebElement> getBilling() {
		return Billing;
	}


	public List<WebElement> getBillingemail() {
		return billingemail;
	}

	public List<WebElement> getBillingphone() {
		return billingphone;
	}

	public List<WebElement> getBillingadd() {
		return billingadd;
	}


	public List<WebElement> getCity() {
		return billingcity;
	}

	public List<WebElement> getBillingstate() {
		return billingstate;
	}


	public List<WebElement> getBillingzip() {
		return billingzip;
	}

	public List<WebElement> getBillingsave() {
		return billingsave;
	}
	public List<WebElement> getEditcompany() {
		return editcompany;
	}
	public List<WebElement> getEditname() {
		return editname;
	}
	public List<WebElement> getEditemail() {
		return editemail;
	}
	public List<WebElement> getEditphone() {
		return editphone;
	}
	public List<WebElement> getEditadd() {
		return editadd;
	}
	public List<WebElement> getEditcity() {
		return editcity;
	}
	public List<WebElement> getEditstate() {
		return editstate;
	}
	public List<WebElement> getEditzip() {
		return editzip;
	}
	public List<WebElement> getEditsave() {
		return editsave;
	}
	public List<WebElement> getUserole() {
		return userole;
	}
	public List<WebElement> getCreaterole() {
		return createrole;
	}
	public List<WebElement> getRolename() {
		return rolename;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public List<WebElement> getRoledes() {
		return roledes;
	}
	public List<WebElement> getRolesave() {
		return rolesave;
	}
	public List<WebElement> getEditrole() {
		return editrole;
	}
	public List<WebElement> getEditwrite() {
		return editwrite;
	}
	public List<WebElement> getEditrole1() {
		return editrole1;
	}
	public List<WebElement> getEditrolename() {
		return editrolename;
	}
	public List<WebElement> getEditroledes() {
		return editroledes;
	}
	public List<WebElement> getEditrolesave() {
		return editrolesave;
	}
	public List<WebElement> getEditcompanyy() {
		return editcompanyy;
	}
	public List<WebElement> getEditjcompany() {
		return editjcompany;
	}
	public List<WebElement> getEditjcompanyname() {
		return editjcompanyname;
	}
	public List<WebElement> getEditjadd() {
		return editjadd;
	}
	public List<WebElement> getEditjsave() {
		return editjsave;
	}
	public List<WebElement> getEditread() {
		return editread;
	}
	public List<WebElement> getDeletrole() {
		return deletrole;
	}
	public List<WebElement> getRoledel() {
		return roledel;
	}
	public List<WebElement> getManageuser() {
		return manageuser;
	}
	public List<WebElement> getInviteuser() {
		return inviteuser;
	}
	public List<WebElement> getInviteemail() {
		return inviteemail;
	}
	public List<WebElement> getInviterole() {
		return inviterole;
	}
	public List<WebElement> getRoleselect() {
		return roleselect;
	}
	public List<WebElement> getCreateuser() {
		return createuser;
	}
	public List<WebElement> getManagerol() {
		return managerol;
	}
	public List<WebElement> getRolechange() {
		return rolechange;
	}
	public List<WebElement> getManageuserole() {
		return manageuserole;
	}
	public List<WebElement> getUnewrole() {
		return unewrole;
	}
	public List<WebElement> getNewrolesave() {
		return newrolesave;
	}
	public List<WebElement> getRemoveuser() {
		return removeuser;
	}
	public List<WebElement> getIot() {
		return iot;
	}
	public List<WebElement> getIot1() {
		return iot1;
	}
	public List<WebElement> getIotNA() {
		return IotNA;
	}
	public List<WebElement> getCtr() {
		return ctr;
	}
	public List<WebElement> getCreateAgent() {
		return CreateAgent;
	}
	public List<WebElement> getAserial() {
		return Aserial;
	}
	public List<WebElement> getASave() {
		return ASave;
	}
	
	public List<WebElement> getAgentAssign() {
		return AgentAssign;
	}
	
	
	public List<WebElement> getAgentellipsis() {
		return Agentellipsis;
	}
	
	public WebElement getViewBas() {
		return ViewBas;
	}
	public List<WebElement> getRebootA() {
		return rebootA;
	}
	
	public List<WebElement> getArename() {
		return Arename;
	}
	
	public List<WebElement> getClosepop() {
		return closepop;
	}
	public List<WebElement> getForgot() {
		return forgot;
	}
	public List<WebElement> getFrgtemail() {
		return frgtemail;
	}
	public List<WebElement> getFrgtreset() {
		return frgtreset;
	}
	public List<WebElement> getManageA() {
		return ManageA;
	}
	
	public List<WebElement> getRestartA() {
		return restartA;
	}
	
	public List<WebElement> getPingA() {
		return pingA;
	}
	 
	public List<WebElement> getUpDateTime() {
		return UpDateTime;
	}
	
	public List<WebElement> getATimezone() {
		return ATimezone;
	}
	
	public List<WebElement> getATime() {
		return ATime;
	}
	
	public List<WebElement> getTimeC() {
		return TimeC;
	}
	
	public List<WebElement> getAssign() {
		return Assign;
	}
	
	public List<WebElement> getASerial() {
		return ASerial;
	}
	
	public List<WebElement> getCloseAssign() {
		return closeAssign;
	}
	
	public List<WebElement> getAFreset() {
		return AFreset;
	}
	
	public List<WebElement> getResetAgent() {
		return ResetAgent;
	}
	
	public List<WebElement> getConfirmR() {
		return ConfirmR;
	}
	
	public List<WebElement> getDeleteA() {
		return DeleteA;
	}
	
	public List<WebElement> getWriteDel() {
		return WriteDel;
	}
	public WebElement getCheckBox() {
		return CheckBox;
	}
	
	public WebElement getSmsBox() {
		return SmsBox;
	}
	
	public WebElement getSubSave() {
		return SubSave;
	}
	public WebElement getSubclient() {
		return Subclient;
	}
	public List<WebElement> getConfirmDel() {
		return ConfirmDel;
	}
	public List<WebElement> getConfig() {
		return config;
	}
	public List<WebElement> getSignObar() {
		return signObar;
	}
	
	//Subscriptions Getter
	public WebElement getSub() {
		return sub;
	}
	public WebElement getSubElsp() {
		return SubElsp;
	}
	public WebElement getUnSubUser() {
		return UnSubUser;
	}
	public WebElement getClientSub() {
		return ClientSub;
	}
	public WebElement getClientElp() {
		return ClientElp;
	}
	public WebElement getClientUnSub() {
		return ClientUnSub;
	}
	 //Architect Getters
	public WebElement getEntity() {
		return Entity;
	}
	public WebElement getClient() {
		return Client;
	}
	public WebElement getCrtClient() {
		return CrtClient;
	}
	public WebElement getBusinessT() {
		return BusinessT;
	}
	public WebElement getSelectBusiness() {
		return SelectBusiness;
	}
	public WebElement getSearchAdd() {
		return searchAdd;
	}
	public WebElement getSelectaddres() {
		return selectaddres;
	}
	public WebElement getClientSave() {
		return ClientSave;
	}
	public WebElement getSite() {
		return Site;
		
	}
	public WebElement getUsmansite() {
		return Usmansite;
	}
	public WebElement getSitename() {
		return Sitename;
	}
	public WebElement getSiteType() {
		return SiteType;
	}
	public WebElement getSiteType1() {
		return SiteType1;
	}
	public WebElement getSFoot() {
		return SFoot;
	}
	public WebElement getFuelTypes() {
		return FuelTypes;
	}
	public WebElement getSelectFT() {
		return SelectFT;
	}
	public WebElement getTab() {
		return Tab;
	}
	
	public WebElement getCampus() {
		return Campus;
	}
	
	
	
	public WebElement getClientDrp() {
		return ClientDrp;
	}
	public WebElement getEqp() {
		return eqp;
	}
	
	public WebElement getCreateEqp() {
		return CreateEqp;
	}
	
	public WebElement getClientNameDrp() {
		return ClientNameDrp;
	}
	
	public WebElement getEqpSave() {
		return EqpSave;
	}
	public WebElement getClName() {
		return ClName;
	}
	public WebElement getCleintName() {
		return CleintName;
	}
	
	public WebElement getSelectClnt() {
		return SelectClnt;
	}
	
	public WebElement getSelectSite() {
		return SelectSite;
	}
	
	public WebElement getSelectSiteName() {
		return SelectSiteName;
	}
	
	public WebElement getGiveName() {
		return GiveName;
	}
	
	public WebElement getEqpType() {
		return EqpType;
	}
	public WebElement getCampusName() {
		return CampusName;
	}
	
	
	public WebElement getEqpTypeSelect() {
		return EqpTypeSelect;
	}
	public WebElement getCampusSave() {
		return CampusSave;
	}
	public WebDriverWait getWait() {
		return wait;
	}
	public List<WebElement> getBillingcity() {
		return billingcity;
	}
	public WebElement getDropDownCancel() {
		return DropDownCancel;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	














}
