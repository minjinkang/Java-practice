package payment;

public class CouponListVO {
	private String CouponNo;
	private String CouponName;
	private String CouponLimit;
	private String sale;
	
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
	public String getCouponNo() {
		return CouponNo;
	}
	public void setCouponNo(String couponNo) {
		this.CouponNo = couponNo;
	}
	public String getCouponName() {
		return CouponName;
	}
	public void setCouponName(String couponName) {
		this.CouponName = couponName;
	}
	public String getCouponLimit() {
		return CouponLimit;
	}
	public void setCouponLimit(String couponLimit) {
		this.CouponLimit = couponLimit;
	}
	
	@Override
	public String toString() {
		return "CouponListVO [CouponNo=" + CouponNo + ", CouponName=" + CouponName + ", CouponLimit=" + CouponLimit
				+ "]";
	}
	
	
}
