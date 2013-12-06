package shiver.me.timbers;

import shiver.me.timbers.types.Abstract;
import shiver.me.timbers.types.Assert;
import shiver.me.timbers.types.Break;
import shiver.me.timbers.types.Byte;
import shiver.me.timbers.types.Case;
import shiver.me.timbers.types.Catch;
import shiver.me.timbers.types.Char;
import shiver.me.timbers.types.Class;
import shiver.me.timbers.types.Const;
import shiver.me.timbers.types.Continue;
import shiver.me.timbers.types.Default;
import shiver.me.timbers.types.Do;
import shiver.me.timbers.types.Double;
import shiver.me.timbers.types.Else;
import shiver.me.timbers.types.Enum;
import shiver.me.timbers.types.Extends;
import shiver.me.timbers.types.Final;
import shiver.me.timbers.types.Finally;
import shiver.me.timbers.types.Float;
import shiver.me.timbers.types.For;
import shiver.me.timbers.types.If;
import shiver.me.timbers.types.Implements;
import shiver.me.timbers.types.Import;
import shiver.me.timbers.types.Instanceof;
import shiver.me.timbers.types.Int;
import shiver.me.timbers.types.Interface;
import shiver.me.timbers.types.Long;
import shiver.me.timbers.types.Native;
import shiver.me.timbers.types.New;
import shiver.me.timbers.types.Null;
import shiver.me.timbers.types.Package;
import shiver.me.timbers.types.Private;
import shiver.me.timbers.types.Protected;
import shiver.me.timbers.types.Public;
import shiver.me.timbers.types.Return;
import shiver.me.timbers.types.Short;
import shiver.me.timbers.types.Static;
import shiver.me.timbers.types.Super;
import shiver.me.timbers.types.Switch;
import shiver.me.timbers.types.Synchronized;
import shiver.me.timbers.types.This;
import shiver.me.timbers.types.Throw;
import shiver.me.timbers.types.Throws;
import shiver.me.timbers.types.Transient;
import shiver.me.timbers.types.Try;
import shiver.me.timbers.types.Void;
import shiver.me.timbers.types.Volatile;
import shiver.me.timbers.types.While;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * This class contains constants to help with parsing Java keywords.
 *
 * @author Karl Bennett
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the Java keywords.
     */
    public static final List<String> KEYWORDS = asList(
            Abstract.NAME, Assert.NAME, shiver.me.timbers.types.Boolean.NAME, Break.NAME, Byte.NAME, Case.NAME,
            Catch.NAME, Char.NAME, Class.NAME, Const.NAME, Continue.NAME, Default.NAME, Do.NAME, Double.NAME, Else.NAME,
            Enum.NAME, Extends.NAME, Final.NAME, Finally.NAME, Float.NAME, For.NAME, If.NAME, Implements.NAME,
            Import.NAME, Instanceof.NAME, Int.NAME, Interface.NAME, Long.NAME, Native.NAME, New.NAME, Null.NAME,
            Package.NAME, Private.NAME, Protected.NAME, Public.NAME, Return.NAME, Short.NAME, Static.NAME, Super.NAME,
            Switch.NAME, Synchronized.NAME, This.NAME, Throw.NAME, Throws.NAME, Transient.NAME, Try.NAME, Void.NAME,
            Volatile.NAME, While.NAME);
}
