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
import ktc_scs_schema.proxies.TC5444_INBETR02DS;
import ktcmdwscsconnector.customs.MessageClass;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class GetTC5444 extends CustomJavaAction<IMendixObject>
{
	private java.lang.String messageString;

	public GetTC5444(IContext context, java.lang.String messageString)
	{
		super(context);
		this.messageString = messageString;
	}

	@java.lang.Override
	public IMendixObject executeAction() throws Exception
	{
		// BEGIN USER CODE
		MessageClass msgClass = new MessageClass();
		TC5444_INBETR02DS msg = new TC5444_INBETR02DS(this.getContext());
		
		try
		{
			// Start Detail
			msgClass.intIndex = 693;
			msgClass.MessageString = this.messageString;

			msg.setINBNTN(msgClass.getMessageNumber(9, 0));
			msg.setINBLON(msgClass.getMessageNumber(7, 0));
			msg.setINUBNT(msgClass.getMessageNumber(9, 0));
			msg.setINUBLO(msgClass.getMessageNumber(7, 0));
			msg.setINTTYP(msgClass.getMessageNumber(4, 0));
			msg.setINKRTN(msgClass.getMessageNumber(19, 0));
			msg.setINRKID(msgClass.getMessageString(6));
			msg.setINBKMK(msgClass.getMessageNumber(19, 0));
			msg.setINTRDT(msgClass.getMessageNumber(8, 0));
			msg.setINVLDT(msgClass.getMessageNumber(8, 0));
			msg.setINBEL(msgClass.getMessageNumber(15, 2));
			msg.setINCCDE(msgClass.getMessageString(3));
			msg.setINREFN(msgClass.getMessageString(15));
			msg.setINREF(msgClass.getMessageString(15));
			msg.setINBKID(msgClass.getMessageNumber(11, 0));
			msg.setBKBPNM(msgClass.getMessageString(40));
			msg.setINCANM(msgClass.getMessageString(40));
			msg.setTRADES(msgClass.getMessageString(50));
			msg.setINUTBN(msgClass.getMessageNumber(9, 0));
			msg.setINUTBL(msgClass.getMessageNumber(7, 0));
			msg.setBNUSER(msgClass.getMessageString(10));
			msg.setWDDATE(msgClass.getMessageNumber(8, 0));
			msg.setWDTIME(msgClass.getMessageNumber(6, 0));
			msg.setINCHQN(msgClass.getMessageNumber(10, 0));
			msg.setINTRST(msgClass.getMessageNumber(3, 0));
			msg.setINREAC(msgClass.getMessageString(3));
			msg.setINBDAT(msgClass.getMessageNumber(8, 0));
			msg.setINPERI(msgClass.getMessageNumber(6, 0));
			msg.setINBUST(msgClass.getMessageNumber(3, 0));
			msg.setINDSCC(msgClass.getMessageString(1));
			msg.setINFKOD(msgClass.getMessageString(15));
			msg.setINKORR(msgClass.getMessageString(1));
			msg.setINPEK(msgClass.getMessageNumber(7, 0));
			msg.setINDTTM(msgClass.getMessageNumber(14, 0));
			msg.setINKNTN(msgClass.getMessageNumber(19, 0));
			msg.setINMEAC(msgClass.getMessageNumber(5, 0));
			msg.setINNOD(msgClass.getMessageNumber(1, 0));
			msg.setINRGKR(msgClass.getMessageString(1));
			msg.setINRGAR(msgClass.getMessageString(1));
			msg.setINACQN(msgClass.getMessageNumber(23, 0));
			msg.setINTRTM(msgClass.getMessageNumber(6, 0));
			msg.setINSEQ1(msgClass.getMessageNumber(4, 0));
			msg.setINTMID(msgClass.getMessageString(8));
			msg.setINGACC(msgClass.getMessageNumber(19, 0));
			msg.setINTSRC(msgClass.getMessageString(1));
			msg.setINSSID(msgClass.getMessageString(4));
			msg.setINGLRR(msgClass.getMessageNumber(13, 0));
			msg.setINBR(msgClass.getMessageNumber(5, 0));
			msg.setINERPR(msgClass.getMessageNumber(5, 3));
			msg.setTPRGKR(msgClass.getMessageString(1));
			msg.setKRTCGR(msgClass.getMessageString(3));
			msg.setWDBTOT(msgClass.getMessageNumber(15, 2));
			msg.setWDBANT(msgClass.getMessageNumber(7, 0));
			msg.setWDSGRP(msgClass.getMessageString(1));
			msg.setWDLINE(msgClass.getMessageNumber(4, 0));
			msg.setWDREG(msgClass.getMessageNumber(15, 2));
			msg.setWDREGT(msgClass.getMessageNumber(7, 0));
			msg.setWDDIF(msgClass.getMessageNumber(15, 2));
			msg.setWDDIFT(msgClass.getMessageNumber(7, 0));
			
			msg.setResponseCode("OK");
			msg.setResponseDescription("Successfully.");
		}
		catch (Exception ex)
		{
			msg.setResponseCode("ER");
			msg.setResponseDescription(ex.getMessage() + " [intIndex=" + msgClass.intIndex + ", Length=" + msgClass.MessageString.length() + "]");
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
		return "GetTC5444";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
