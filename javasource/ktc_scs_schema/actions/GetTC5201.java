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
import ktc_scs_schema.proxies.TC5201_INPART03DS;
import ktcmdwscsconnector.customs.MessageClass;

public class GetTC5201 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5201(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5201_INPART03DS msg = new TC5201_INPART03DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;
			
			msg.setIPKIPN(msgClass.getMessageNumber(19,0));
			msg.setIPLSNM(msgClass.getMessageString(40));
			msg.setIPCIFN(msgClass.getMessageNumber(19,0));
			msg.setIPOLIC(msgClass.getMessageString(40));
			msg.setIPITP1(msgClass.getMessageString(3));
			msg.setIPCIDT(msgClass.getMessageString(3));
			msg.setIPTITL(msgClass.getMessageString(6));
			msg.setIPNAME(msgClass.getMessageString(40));
			msg.setIPINIT(msgClass.getMessageString(40));
			msg.setIPEMNM(msgClass.getMessageString(26));
			msg.setIPEMN1(msgClass.getMessageString(26));
			msg.setIPNWIC(msgClass.getMessageString(40));
			msg.setIPITP2(msgClass.getMessageString(3));
			msg.setIPMONM(msgClass.getMessageString(40));
			msg.setIPMBRS(msgClass.getMessageNumber(6,0));
			msg.setIPSEX(msgClass.getMessageNumber(1,0));
			msg.setIPNATI(msgClass.getMessageString(3));
			msg.setIPPENO(msgClass.getMessageNumber(11,0));
			msg.setIPFDAT(msgClass.getMessageNumber(8,0));
			msg.setIPFORT(msgClass.getMessageString(25));
			msg.setIPINCD(msgClass.getMessageString(1));
			msg.setIPRELG(msgClass.getMessageString(6));
			msg.setIPCTCD(msgClass.getMessageString(3));
			msg.setIPLCDE(msgClass.getMessageString(3));
			msg.setIPCIVS(msgClass.getMessageString(3));
			msg.setIPBERO(msgClass.getMessageNumber(3,0));
			msg.setIPAKRT(msgClass.getMessageString(1));
			msg.setIPRISC(msgClass.getMessageString(3));
			msg.setIPHEDU(msgClass.getMessageString(3));
			msg.setIPRACE(msgClass.getMessageString(6));
			msg.setIPPRVH(msgClass.getMessageString(1));
			msg.setIPITYP(msgClass.getMessageNumber(1,0));
			msg.setIPFRNM(msgClass.getMessageString(20));
			msg.setIPNAM2(msgClass.getMessageString(40));
			msg.setIPHUS(msgClass.getMessageString(3));
			msg.setIPFLDT(msgClass.getMessageNumber(6,0));
			msg.setIPADRF(msgClass.getMessageString(1));
			msg.setIPSEQ1(msgClass.getMessageNumber(4,0));
			msg.setIPADR1(msgClass.getMessageString(40));
			msg.setIPADR2(msgClass.getMessageString(40));
			msg.setIPADR3(msgClass.getMessageString(40));
			msg.setIPADR4(msgClass.getMessageString(40));
			msg.setIPPNR(msgClass.getMessageString(9));
			msg.setIPCITY(msgClass.getMessageString(40));
			msg.setIPLSTE(msgClass.getMessageString(3));
			msg.setIPCNCD(msgClass.getMessageString(3));
			msg.setIPTELH(msgClass.getMessageString(20));
			msg.setIPTELA(msgClass.getMessageString(20));
			msg.setIPFAX1(msgClass.getMessageString(20));
			msg.setIPEMLP(msgClass.getMessageString(100));
			msg.setIPEML1(msgClass.getMessageString(100));
			msg.setIPCBIL(msgClass.getMessageString(1));
			msg.setIPMMTL(msgClass.getMessageNumber(3,0));
			msg.setIPBRCD(msgClass.getMessageString(1));
			msg.setIPCONO(msgClass.getMessageNumber(3,0));
			msg.setIPCODT(msgClass.getMessageNumber(8,0));
			msg.setIPOLAC(msgClass.getMessageNumber(19,0));
			msg.setIPBGNO(msgClass.getMessageNumber(19,0));
			msg.setIPBANM(msgClass.getMessageString(40));
			msg.setIPKNTL(msgClass.getMessageNumber(5,0));
			msg.setIPUSC1(msgClass.getMessageString(3));
			msg.setIPUSC2(msgClass.getMessageString(3));
			msg.setIPUSC3(msgClass.getMessageString(3));
			msg.setIPUSC4(msgClass.getMessageString(3));
			msg.setIPLIAB(msgClass.getMessageString(1));
			msg.setIPCTNM(msgClass.getMessageString(40));
			msg.setIPRCTP(msgClass.getMessageString(1));
			msg.setIPREST(msgClass.getMessageString(1));
			msg.setIPDCSD(msgClass.getMessageString(1));
			msg.setIPBOD6(msgClass.getMessageNumber(19,0));
			msg.setIPDTTM(msgClass.getMessageNumber(14,0));
			msg.setIPTEL3(msgClass.getMessageString(20));
			msg.setIPLBIL(msgClass.getMessageString(1));
			msg.setIPEXDT(msgClass.getMessageNumber(8,0));
			msg.setIPBVDT(msgClass.getMessageNumber(8,0));
			msg.setIPPSTS(msgClass.getMessageString(1));
			msg.setIPCLAS(msgClass.getMessageString(1));
			msg.setIPGSTI(msgClass.getMessageString(1));
			msg.setIPBR(msgClass.getMessageNumber(5,0));
			msg.setIPLSNC(msgClass.getMessageString(40));
			msg.setIPTELHE(msgClass.getMessageNumber(7,0));
			msg.setIPTELAE(msgClass.getMessageNumber(7,0));
			msg.setIPSPHI(msgClass.getMessageString(4));
			msg.setIPSPED(msgClass.getMessageNumber(8,0));
			msg.setIPSPCD(msgClass.getMessageNumber(8,0));
			msg.setIPSPCB(msgClass.getMessageString(10));
			msg.setIPSPPI(msgClass.getMessageString(4));
			msg.setIPSPHR(msgClass.getMessageString(100));
			msg.setIPSPRF(msgClass.getMessageString(1));

		}
		catch (Exception ex)
		{
			msg.setCode("ER");
			msg.setDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
		}
		
		return msg.getMendixObject();
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetTC5201";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
