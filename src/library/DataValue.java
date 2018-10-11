package library;
import java.util.Date;

public class DataValue {
	
	//Constructor
	DataValue() {};
	
	DataValue(float degree, Date time){
	this.mDegreeValue =degree;
	this.mTimeValue=time;
	}

	private float mDegreeValue;
	private Date mTimeValue;
	
	public float getDegreeValue() {
		return mDegreeValue;
	}
	public void setDegreeValue(float mDegreeValue) {
		this.mDegreeValue = mDegreeValue;
	}
	
	public Date getTimeValue() {
		return mTimeValue;
	}
	public void setTimeValue(Date mTimeValue) {
		this.mTimeValue = mTimeValue;
	}
	
	
}
