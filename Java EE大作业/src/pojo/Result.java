package pojo;

public class Result {
	int err_code;
	String err_msg;
	Object data;
	
	public Result(int err_code, String err_msg, Object data) {
		this.data = data;
		this.err_code = err_code;
		this.err_msg = err_msg;
	}
	
	public int getErr_code() {
		return err_code;
	}
	public void setErr_code(int err_code) {
		this.err_code = err_code;
	}
	public String getErr_msg() {
		return err_msg;
	}
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
