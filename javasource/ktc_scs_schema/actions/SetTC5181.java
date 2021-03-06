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
import com.mendix.webui.CustomJavaAction;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class SetTC5181 extends CustomJavaAction<java.lang.String>
{
	private IMendixObject __TC5181Rq;
	private ktc_scs_schema.proxies.TC5181_INTPRJ01DS TC5181Rq;

	public SetTC5181(IContext context, IMendixObject TC5181Rq)
	{
		super(context);
		this.__TC5181Rq = TC5181Rq;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		this.TC5181Rq = __TC5181Rq == null ? null : ktc_scs_schema.proxies.TC5181_INTPRJ01DS.initialize(getContext(), __TC5181Rq);

		// BEGIN USER CODE
		StringBuilder strMessageDetail = new StringBuilder();
		try
		{
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDKNTX(), 11));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDFRDT(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5181Rq.getWDTCGR(), 6));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDSLDO(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDPROJ(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDOVDU(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDOVLM(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDOTHR(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDTOTL(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDGRTP(), 2));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDCUSG(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDUPPR(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getKRPRBO(), 15));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getLLUFLX(), 15));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5181Rq.getKUDCDE(), 2));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getKUSKUT(), 8));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5181Rq.getWDSACT(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getLLFTOT(), 15));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5181Rq.getWDINEX(), 1));
			strMessageDetail.append(MessageClass.setMessageString(this.TC5181Rq.getWDINSP(), 1));
			strMessageDetail.append(MessageClass.setMessageNumber(this.TC5181Rq.getWDFLIC(), 15));
		}
		catch (Exception ex)
		{
			throw ex;
		}
		
		return strMessageDetail.toString();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "SetTC5181";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
