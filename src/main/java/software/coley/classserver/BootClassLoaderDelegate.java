package software.coley.classserver;

/**
 * Class loader that delegates to boot class loader.
 *
 * @author xDark
 */
public final class BootClassLoaderDelegate extends ClassLoader {
	/**
	 * Passes {@code null} to {@link ClassLoader#ClassLoader(ClassLoader)}.
	 */
	public BootClassLoaderDelegate() {
		super(null);
	}
}