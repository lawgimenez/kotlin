/*
 * Copyright 2010-2022 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.parcelize

import org.jetbrains.kotlin.backend.common.extensions.IrGenerationExtension
import org.jetbrains.kotlin.backend.common.extensions.IrPluginContext
import org.jetbrains.kotlin.ir.declarations.IrModuleFragment
import org.jetbrains.kotlin.name.FqName

class ParcelizeFirIrGeneratorExtension(
    private val parcelizeAnnotations: List<FqName>,
    private val experimentalCodeGeneration: Boolean,
) : IrGenerationExtension {
    override fun generate(moduleFragment: IrModuleFragment, pluginContext: IrPluginContext) {
        val androidSymbols = AndroidSymbols(pluginContext, moduleFragment)
        ParcelizeFirIrTransformer(pluginContext, androidSymbols, parcelizeAnnotations, experimentalCodeGeneration).transform(moduleFragment)
    }
}
