package io.github.jackbeback.klib.theme.icons.dazzleline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DazzleLine.HatWizardAlt: ImageVector
    get() {
        if (_HatWizardAlt != null) {
            return _HatWizardAlt!!
        }
        _HatWizardAlt = ImageVector.Builder(
            name = "HatWizardAlt",
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
                moveTo(21f, 20f)
                lineTo(20f, 21f)
                moveTo(20f, 21f)
                horizontalLineTo(4f)
                moveTo(20f, 21f)
                lineTo(17.103f, 13.396f)
                curveTo(16.694f, 12.321f, 16.489f, 11.783f, 16.39f, 11.228f)
                curveTo(16.302f, 10.736f, 16.276f, 10.234f, 16.313f, 9.735f)
                curveTo(16.354f, 9.173f, 16.502f, 8.617f, 16.799f, 7.505f)
                lineTo(18f, 3f)
                lineTo(12.047f, 6.307f)
                curveTo(10.918f, 6.934f, 10.354f, 7.248f, 9.88f, 7.661f)
                curveTo(9.459f, 8.027f, 9.091f, 8.45f, 8.787f, 8.918f)
                curveTo(8.444f, 9.446f, 8.212f, 10.048f, 7.749f, 11.253f)
                lineTo(4f, 21f)
                moveTo(4f, 21f)
                lineTo(3f, 20f)
                moveTo(14f, 16f)
                curveTo(14f, 17.105f, 13.105f, 18f, 12f, 18f)
                curveTo(10.895f, 18f, 10f, 17.105f, 10f, 16f)
                moveTo(14f, 16f)
                curveTo(14f, 14.895f, 13.105f, 14f, 12f, 14f)
                curveTo(10.895f, 14f, 10f, 14.895f, 10f, 16f)
                moveTo(14f, 16f)
                horizontalLineTo(18f)
                moveTo(10f, 16f)
                horizontalLineTo(6f)
            }
        }.build()

        return _HatWizardAlt!!
    }

@Suppress("ObjectPropertyName")
private var _HatWizardAlt: ImageVector? = null
