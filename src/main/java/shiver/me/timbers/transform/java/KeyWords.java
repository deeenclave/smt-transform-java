package shiver.me.timbers.transform.java;

import shiver.me.timbers.transform.antlr4.StaticNameListBuilder;
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

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.unmodifiableList;

/**
 * This class contains constants to help with parsing Java keywords.
 */
public final class KeyWords {

    private KeyWords() {
    }

    /**
     * All the transformation types of the Java keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<java.lang.Class> KEYWORDS = unmodifiableList(Arrays.<java.lang.Class>asList(
            Abstract.class, Assert.class, Boolean.class, Break.class, Byte.class, Case.class, Catch.class,
            Char.class, Class.class, Continue.class, Default.class, Do.class, Double.class, Else.class,
            Enum.class, Extends.class, Final.class, Finally.class, Float.class, For.class, If.class,
            Implements.class, Import.class, Instanceof.class, Int.class, Interface.class, Long.class,
            Native.class, New.class, Null.class, Package.class, Private.class, Protected.class, Public.class,
            Return.class, Short.class, Static.class, Super.class, Switch.class, Synchronized.class, This.class,
            Throw.class, Throws.class, Transient.class, Try.class, Void.class, Volatile.class, While.class
    ));

    /**
     * All the names of the Java keyword types.
     */
    @SuppressWarnings("unchecked")
    public static final List<String> KEYWORD_NAMES = unmodifiableList(
            new StaticNameListBuilder((Iterable) KEYWORDS).build());
}
