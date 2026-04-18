package com.k256.createtransportadditions;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class ModExpectPlatform {
    /**
     * an example of {@link ExpectPlatform}.
     * <p>
     * This must be a <b>public static</b> method. The platform-implemented solution must be placed under a
     * platform sub-package, with its class suffixed with {@code Impl}.
     * <p>
     * Example:
     * Expect: com.k256.createtransportadditions.ModExpectPlatform#platformName()
     * Actual Fabric: com.k256.createtransportadditions.fabric.ModExpectPlatformImpl#platformName()
     * Actual Forge: com.k256.createtransportadditions.forge.ModExpectPlatformImpl#platformName()
     * <p>
     * <a href="https://plugins.jetbrains.com/plugin/16210-architectury">You should also get the IntelliJ plugin to help with @ExpectPlatform.</a>
     */
    @ExpectPlatform
    public static String platformName() {
        // Just throw an error, the content should get replaced at runtime.
        throw new AssertionError();
    }
}
