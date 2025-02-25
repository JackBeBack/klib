package io.github.jackbeback.klib.theme.icons.gentlecons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Gentlecons.Next: ImageVector
    get() {
        if (_Next != null) {
            return _Next!!
        }
        _Next = ImageVector.Builder(
            name = "Next",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0F0F0F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.604f, 4.231f)
                curveTo(4.946f, 3.731f, 4f, 4.201f, 4f, 5.028f)
                verticalLineTo(18.972f)
                curveTo(4f, 19.799f, 4.946f, 20.269f, 5.604f, 19.769f)
                lineTo(14.795f, 12.797f)
                curveTo(15.323f, 12.396f, 15.323f, 11.604f, 14.795f, 11.203f)
                lineTo(5.604f, 4.231f)
                close()
                moveTo(2f, 5.028f)
                curveTo(2f, 2.548f, 4.838f, 1.139f, 6.813f, 2.638f)
                lineTo(16.004f, 9.61f)
                curveTo(17.587f, 10.81f, 17.587f, 13.19f, 16.004f, 14.39f)
                lineTo(6.813f, 21.362f)
                curveTo(4.838f, 22.861f, 2f, 21.452f, 2f, 18.972f)
                verticalLineTo(5.028f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F0F0F))) {
                moveTo(20f, 3f)
                curveTo(20f, 2.448f, 20.448f, 2f, 21f, 2f)
                curveTo(21.552f, 2f, 22f, 2.448f, 22f, 3f)
                verticalLineTo(21f)
                curveTo(22f, 21.552f, 21.552f, 22f, 21f, 22f)
                curveTo(20.448f, 22f, 20f, 21.552f, 20f, 21f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _Next!!
    }

@Suppress("ObjectPropertyName")
private var _Next: ImageVector? = null
