package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HalloweenDecorations: ImageVector
    get() {
        if (_HalloweenDecorations != null) {
            return _HalloweenDecorations!!
        }
        _HalloweenDecorations = ImageVector.Builder(
            name = "HalloweenDecorations",
            defaultWidth = 800.dp,
            defaultHeight = 800.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.586f, 16f)
                curveTo(7.398f, 15.339f, 5f, 12.489f, 5f, 9.072f)
                curveTo(5f, 5.166f, 8.134f, 2f, 12f, 2f)
                curveTo(15.866f, 2f, 19f, 5.166f, 19f, 9.072f)
                curveTo(19f, 12.458f, 16.645f, 15.288f, 13.5f, 15.982f)
                moveTo(12f, 19f)
                curveTo(13.105f, 19f, 14f, 18.5f, 14f, 17.47f)
                curveTo(14f, 16.889f, 13.752f, 16.365f, 13.356f, 16f)
                moveTo(12f, 19f)
                curveTo(10.895f, 19f, 10f, 18.5f, 10f, 17.47f)
                curveTo(10f, 16.889f, 10.248f, 16.365f, 10.644f, 16f)
                moveTo(12f, 19f)
                verticalLineTo(22f)
                moveTo(14.277f, 10.908f)
                curveTo(14.892f, 10.908f, 15.475f, 10.775f, 16f, 10.538f)
                curveTo(15.343f, 11.99f, 13.882f, 13f, 12.185f, 13f)
                curveTo(9.874f, 13f, 8f, 11.126f, 8f, 8.815f)
                curveTo(8f, 7.118f, 9.01f, 5.657f, 10.462f, 5f)
                curveTo(10.225f, 5.525f, 10.092f, 6.109f, 10.092f, 6.723f)
                curveTo(10.092f, 9.034f, 11.966f, 10.908f, 14.277f, 10.908f)
                close()
            }
        }.build()

        return _HalloweenDecorations!!
    }

@Suppress("ObjectPropertyName")
private var _HalloweenDecorations: ImageVector? = null
