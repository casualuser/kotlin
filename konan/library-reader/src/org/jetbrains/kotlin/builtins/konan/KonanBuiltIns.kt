/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.builtins.konan

import org.jetbrains.kotlin.builtins.KotlinBuiltIns
import org.jetbrains.kotlin.name.Name
import org.jetbrains.kotlin.storage.StorageManager

class KonanBuiltIns(storageManager: StorageManager) : KotlinBuiltIns(storageManager) {

    override fun getSuspendFunction(parameterCount: Int) =
        getBuiltInClassByName(Name.identifier("SuspendFunction$parameterCount"))
}
