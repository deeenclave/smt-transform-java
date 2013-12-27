package shiver.me.timbers.transform.java;

import shiver.me.timbers.transform.java.types.Abstract;
import shiver.me.timbers.transform.java.types.Assert;
import shiver.me.timbers.transform.java.types.Boolean;
import shiver.me.timbers.transform.java.types.Break;
import shiver.me.timbers.transform.java.types.Byte;
import shiver.me.timbers.transform.java.types.Case;
import shiver.me.timbers.transform.java.types.Catch;
import shiver.me.timbers.transform.java.types.Char;
import shiver.me.timbers.transform.java.types.Class;
import shiver.me.timbers.transform.java.types.Continue;
import shiver.me.timbers.transform.java.types.Default;
import shiver.me.timbers.transform.java.types.Do;
import shiver.me.timbers.transform.java.types.Double;
import shiver.me.timbers.transform.java.types.Else;
import shiver.me.timbers.transform.java.types.Enum;
import shiver.me.timbers.transform.java.types.Extends;
import shiver.me.timbers.transform.java.types.Final;
import shiver.me.timbers.transform.java.types.Finally;
import shiver.me.timbers.transform.java.types.Float;
import shiver.me.timbers.transform.java.types.For;
import shiver.me.timbers.transform.java.types.If;
import shiver.me.timbers.transform.java.types.Implements;
import shiver.me.timbers.transform.java.types.Import;
import shiver.me.timbers.transform.java.types.Instanceof;
import shiver.me.timbers.transform.java.types.Int;
import shiver.me.timbers.transform.java.types.Interface;
import shiver.me.timbers.transform.java.types.Long;
import shiver.me.timbers.transform.java.types.Native;
import shiver.me.timbers.transform.java.types.New;
import shiver.me.timbers.transform.java.types.Null;
import shiver.me.timbers.transform.java.types.Package;
import shiver.me.timbers.transform.java.types.Private;
import shiver.me.timbers.transform.java.types.Protected;
import shiver.me.timbers.transform.java.types.Public;
import shiver.me.timbers.transform.java.types.Return;
import shiver.me.timbers.transform.java.types.Short;
import shiver.me.timbers.transform.java.types.Static;
import shiver.me.timbers.transform.java.types.Super;
import shiver.me.timbers.transform.java.types.Switch;
import shiver.me.timbers.transform.java.types.Synchronized;
import shiver.me.timbers.transform.java.types.This;
import shiver.me.timbers.transform.java.types.Throw;
import shiver.me.timbers.transform.java.types.Throws;
import shiver.me.timbers.transform.java.types.Transient;
import shiver.me.timbers.transform.java.types.Try;
import shiver.me.timbers.transform.java.types.Void;
import shiver.me.timbers.transform.java.types.Volatile;
import shiver.me.timbers.transform.java.types.While;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * This class contains constants to help with parsing Java keywords.
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the names of the Java keyword types.
     */
    public static final List<String> KEYWORD_NAMES = asList(
            Abstract.NAME, Assert.NAME, Boolean.NAME, Break.NAME, Byte.NAME, Case.NAME, Catch.NAME, Char.NAME,
            Class.NAME, Continue.NAME, Default.NAME, Do.NAME, Double.NAME, Else.NAME, Enum.NAME, Extends.NAME,
            Final.NAME, Finally.NAME, Float.NAME, For.NAME, If.NAME, Implements.NAME, Import.NAME, Instanceof.NAME,
            Int.NAME, Interface.NAME, Long.NAME, Native.NAME, New.NAME, Null.NAME, Package.NAME, Private.NAME,
            Protected.NAME, Public.NAME, Return.NAME, Short.NAME, Static.NAME, Super.NAME, Switch.NAME,
            Synchronized.NAME, This.NAME, Throw.NAME, Throws.NAME, Transient.NAME, Try.NAME, Void.NAME, Volatile.NAME,
            While.NAME);
}
