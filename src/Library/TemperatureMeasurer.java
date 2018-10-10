import java.util.LinkedList;
import java.util.List;

public class TemperatureMeasurer {
	
	TemperatureMeasurer(){
		mMeasurements=new LinkedList<DataValue>();
	}
	
	private List<DataValue> mMeasurements;
	
	private void addValue(DataValue value) {
		mMeasurements.add(value);
	}
	
	public void ConductMeasurement() {
		//TODO: Find out how to conduct measurements
		//TODO: Add value
		//addValue();
	}
}
