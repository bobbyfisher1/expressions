package org.example.smalljava;

import com.google.common.collect.Iterables;
import java.util.LinkedHashSet;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.example.smalljava.smallJava.SJBlock;
import org.example.smalljava.smallJava.SJClass;
import org.example.smalljava.smallJava.SJField;
import org.example.smalljava.smallJava.SJMethod;
import org.example.smalljava.smallJava.SJReturn;

@SuppressWarnings("all")
public class SmallJavaModelUtil {
  public LinkedHashSet<SJClass> classHierarchy(final SJClass c) {
    final LinkedHashSet<SJClass> visited = CollectionLiterals.<SJClass>newLinkedHashSet();
    SJClass current = c.getSuperclass();
    while (((current != null) && (!visited.contains(current)))) {
      {
        visited.add(current);
        current = current.getSuperclass();
      }
    }
    return visited;
  }
  
  public Iterable<SJField> fields(final SJClass c) {
    return Iterables.<SJField>filter(c.getMembers(), SJField.class);
  }
  
  public Iterable<SJMethod> methods(final SJClass c) {
    return Iterables.<SJMethod>filter(c.getMembers(), SJMethod.class);
  }
  
  public SJReturn returnStatement(final SJMethod m) {
    return this.returnStatement(m.getBody());
  }
  
  public SJReturn returnStatement(final SJBlock block) {
    return IterableExtensions.<SJReturn>head(Iterables.<SJReturn>filter(block.getStatements(), SJReturn.class));
  }
}
