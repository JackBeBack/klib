package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Unlock: ImageVector
    get() {
        if (_Unlock != null) {
            return _Unlock!!
        }
        _Unlock = ImageVector.Builder(
            name = "Unlock",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(13.5f, 16.585f)
                curveTo(13.5f, 17.414f, 12.828f, 18.085f, 12f, 18.085f)
                curveTo(11.172f, 18.085f, 10.5f, 17.414f, 10.5f, 16.585f)
                curveTo(10.5f, 15.757f, 11.172f, 15.085f, 12f, 15.085f)
                curveTo(12.828f, 15.085f, 13.5f, 15.757f, 13.5f, 16.585f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.334f, 10f)
                curveTo(6.21f, 9.644f, 6.095f, 9.271f, 5.998f, 8.887f)
                curveTo(5.695f, 7.684f, 5.545f, 6.294f, 5.897f, 4.974f)
                curveTo(6.262f, 3.609f, 7.147f, 2.397f, 8.743f, 1.595f)
                curveTo(10.34f, 0.793f, 11.84f, 0.807f, 13.153f, 1.329f)
                curveTo(14.422f, 1.834f, 15.448f, 2.784f, 16.232f, 3.745f)
                curveTo(16.43f, 3.989f, 16.617f, 4.237f, 16.791f, 4.484f)
                curveTo(17.081f, 4.897f, 16.978f, 5.459f, 16.582f, 5.771f)
                curveTo(16.112f, 6.142f, 15.427f, 6.011f, 15.077f, 5.525f)
                curveTo(14.951f, 5.351f, 14.82f, 5.178f, 14.682f, 5.009f)
                curveTo(14.009f, 4.184f, 13.242f, 3.517f, 12.414f, 3.187f)
                curveTo(11.629f, 2.875f, 10.725f, 2.838f, 9.641f, 3.382f)
                curveTo(8.557f, 3.927f, 8.048f, 4.675f, 7.83f, 5.491f)
                curveTo(7.6f, 6.352f, 7.677f, 7.365f, 7.938f, 8.398f)
                curveTo(8.08f, 8.961f, 8.269f, 9.505f, 8.471f, 10f)
                horizontalLineTo(18f)
                curveTo(19.657f, 10f, 21f, 11.343f, 21f, 13f)
                verticalLineTo(20f)
                curveTo(21f, 21.657f, 19.657f, 23f, 18f, 23f)
                horizontalLineTo(6f)
                curveTo(4.343f, 23f, 3f, 21.657f, 3f, 20f)
                verticalLineTo(13f)
                curveTo(3f, 11.343f, 4.343f, 10f, 6f, 10f)
                horizontalLineTo(6.334f)
                close()
                moveTo(19f, 13f)
                curveTo(19f, 12.448f, 18.552f, 12f, 18f, 12f)
                horizontalLineTo(6f)
                curveTo(5.448f, 12f, 5f, 12.448f, 5f, 13f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 5.448f, 21f, 6f, 21f)
                horizontalLineTo(18f)
                curveTo(18.552f, 21f, 19f, 20.552f, 19f, 20f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Unlock!!
    }

@Suppress("ObjectPropertyName")
private var _Unlock: ImageVector? = null
