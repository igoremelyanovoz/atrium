//TODO remove file with 0.17.0
@file:Suppress("DEPRECATION")

package ch.tutteli.atrium.core.robstoll.lib.reporting

import ch.tutteli.atrium.reporting.AtriumErrorAdjuster

@Deprecated(
    "Use RemoveAtriumFromAtriumErrorAdjuster from atrium-core, will be removed with 0.17.0",
    ReplaceWith("ch.tutteli.atrium.reporting.erroradjusters.impl.RemoveAtriumFromAtriumErrorAdjuster")
)
expect class RemoveAtriumFromAtriumErrorAdjuster() : AtriumErrorAdjuster
