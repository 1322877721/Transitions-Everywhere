/*
 * Copyright (C) 2016 Andrey Kulikov (andkulikov@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.transitionseverywhere.utils;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

/**
 * It's great idea to extend it for any properties that works with float fields
 * because ObjectAnimator have optimizations for FloatProperty to avoid autoboxing.
 *
 * Created by Andrey Kulikov on 17/04/16.
 */
@SuppressLint("NewApi, Override")
public abstract class FloatProperty<T> extends android.util.FloatProperty<T> {

    public FloatProperty() {
        super(null);
        // null instead of name here because it's used only for calling setter
        // and getter via reflection. but we have our own overridden set and get.
    }

    /**
     * Just default implementation. Some of properties can have no getter. Override for real getter
     */
    @Override
    @NonNull
    public Float get(@NonNull T object) {
        return 0f;
    }

}
