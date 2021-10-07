// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package ktc_scs_schema.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;

public class SetTC5556 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __request;
	private ktc_scs_schema.proxies.TC5556_INPART09DS request;

	public SetTC5556(IContext context, IMendixObject request)
	{
		super(context);
		this.__request = request;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.request = __request == null ? null : ktc_scs_schema.proxies.TC5556_INPART09DS.initialize(getContext(), __request);

		// BEGIN USER CODE
		StringBuffer sb = new StringBuffer();

		try {
			sb.append(MessageClass.setMessageNumber(this.request.getIPKIPN(), 19));
			sb.append(MessageClass.setMessageString(this.request.getIPINIT(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPLSNM(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPNAME(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPNAM2(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPADR1(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPADR2(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPADR3(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPADR4(), 40));
			sb.append(MessageClass.setMessageNumber(this.request.getIPCIFN(), 19));
			sb.append(MessageClass.setMessageNumber(this.request.getIPFDAT(), 8));
			sb.append(MessageClass.setMessageString(this.request.getIPOLIC(), 40));
			sb.append(MessageClass.setMessageString(this.request.getIPITP1(), 3));
			sb.append(MessageClass.setMessageString(this.request.getIPCTCD(), 3));
			sb.append(MessageClass.setMessageNumber(this.request.getIPDTTM(), 14));
			sb.append(MessageClass.setMessageString(this.request.getKRSTFR(), 1));
			sb.append(MessageClass.setMessageString(this.request.getWDKYCF(), 1));
			sb.append(MessageClass.setMessageString(this.request.getWDSPHF(), 1));
			sb.append(MessageClass.setMessageNumber(this.request.getKTKRTN(), 19));
			sb.append(MessageClass.setMessageString(this.request.getIPSPHI(), 4));


		} catch (Exception ex) {
			throw new com.mendix.systemwideinterfaces.MendixRuntimeException(ex.getMessage());
		}

		return sb.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5556";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
