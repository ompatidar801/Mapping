package many2one9;

public class BankCustomerDTO 
{
	private int cstid;
	private String custname;
	private int phoneno;
	private BankDTO parentObject;
	
	public int getCstid() {
		return cstid;
	}
	public void setCstid(int cstid) {
		this.cstid = cstid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public BankDTO getParentObject() {
		return parentObject;
	}
	public void setParentObject(BankDTO parentObject) {
		this.parentObject = parentObject;
	}
	
	
	
}
