package app.revanced.patches.youtube.layout.seekbar.seekbartapping.bytecode.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.annotation.FuzzyPatternScanMethod
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.Opcode

@FuzzyPatternScanMethod(2) // FIXME: Test this threshold and find the best value.
object SeekbarTappingFingerprint : MethodFingerprint(
    "Z", AccessFlags.PUBLIC or AccessFlags.FINAL, listOf("L"), listOf(
        Opcode.INVOKE_VIRTUAL,
        Opcode.MOVE_RESULT_WIDE,
        Opcode.IGET,
        Opcode.IGET_OBJECT,
        Opcode.IGET,
        Opcode.DIV_INT_2ADDR,
        Opcode.ADD_INT,
        Opcode.SUB_INT_2ADDR,
        Opcode.INT_TO_FLOAT,
        Opcode.CMPG_FLOAT,
        Opcode.IF_GTZ,
        Opcode.INT_TO_FLOAT,
        Opcode.CMPG_FLOAT,
        Opcode.IF_GTZ,
        Opcode.CONST_4,
        Opcode.INVOKE_INTERFACE,
        Opcode.NEW_INSTANCE,
        Opcode.INVOKE_DIRECT,
        Opcode.IPUT_OBJECT,
        Opcode.INVOKE_VIRTUAL
    )
)