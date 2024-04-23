package app.revanced.patches.shared.fingerprints.opus

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.MethodFingerprint
import com.android.tools.smali.dexlib2.AccessFlags
import com.android.tools.smali.dexlib2.Opcode

object CodecSelectorFingerprint : MethodFingerprint(
    returnType = "L",
    accessFlags = AccessFlags.PUBLIC or AccessFlags.STATIC,
    parameters = listOf("L", "L", "L", "L", "Ljava/lang/String;"),
    opcodes = listOf(
        Opcode.NEW_INSTANCE,
        Opcode.NEW_INSTANCE,
        Opcode.INVOKE_STATIC,
        Opcode.MOVE_RESULT_OBJECT
    ),
    strings = listOf("Audio track id %s not in audio streams")
)
